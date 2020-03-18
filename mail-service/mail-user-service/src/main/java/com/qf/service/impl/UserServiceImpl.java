package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.base.BaseServiceImpl;
import com.qf.base.IBaseDao;
import com.qf.constant.RabbitConstant;
import com.qf.constant.RedisConstant;
import com.qf.dto.EmailMessageDTO;
import com.qf.dto.ResultBean;
import com.qf.entity.TUser;
import com.qf.mapper.TUserMapper;
import com.qf.user.api.IUserService;
import com.qf.util.SpringSecurityUtil;
import com.qf.util.StringUtil;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
@Service
public class UserServiceImpl extends BaseServiceImpl<TUser> implements IUserService {

    @Autowired
    private TUserMapper userMapper;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private RedisTemplate redisTemplate;



    @Value("{activeAccountServer}")
    String activeAccountServer;

    @Override
    public IBaseDao<TUser> getBaseDao() {
        return userMapper;
    }

    @Override
    public ResultBean checkLogin(String username, String password) {
        TUser user = userMapper.selectByUsername(username);
        if (user!=null){
            if (password!=null && !"".equals(password)&&encoder.matches(password,user.getPassword())){
                return ResultBean.success(user,"登录成功");
            }
        }
        return ResultBean.error("用户名或密码错误");
    }

    @Override
    public ResultBean checkIsLogin(String uuid) {
        if(uuid!=null&&!"".equals(uuid)){
            //1.组织键   user:login:dbe06afc-8540-4b74-8035-99e188d33933
            String redisKey = StringUtil.getRedisKey(RedisConstant.USER_LOGIN_PRE, uuid);
            //2.去redis中查
            Object o = redisTemplate.opsForValue().get(redisKey);
            if(o!=null){
                TUser user  = (TUser) o;
                user.setPassword("");//数据传递时不带密码
                return ResultBean.success(user,"用户已登录");
            }
        }
        return ResultBean.error("用户未登录");

    }

    @Override
    public ResultBean regist(String phone, Integer code, String password) {
        //1.校验验证码
        String redisKey = StringUtil.getRedisKey(RedisConstant.REGISTER_PHONE, phone);
        System.out.println(phone+"ttttttttttttttttttttttttt");
        Integer redisCode = (Integer) redisTemplate.opsForValue().get(redisKey);
        System.out.println(redisCode+"cccccccccccccccccccccccccccccccccc");
        if(code.equals(redisCode)){//验证码正确
            TUser user = new TUser();
            user.setPassword(SpringSecurityUtil.getEncodePassword(password));
            user.setPhone(phone);
            System.out.println(user+"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            //插入到数据库中
            userMapper.insertSelective(user);
            return ResultBean.success("注册成功");
        }
        //
        return ResultBean.error("验证码错误");
    }

    @Override
    public ResultBean registByEmail(String email, String password) {

        try {
            //发邮件
            EmailMessageDTO messageDTO=new EmailMessageDTO();
            messageDTO.setEmail(email);

            //生成uuid
            String uuid = UUID.randomUUID().toString();

            //创建url
            String url=activeAccountServer+uuid;
            messageDTO.setUrl(url);

            rabbitTemplate.convertAndSend(RabbitConstant.EMAIL_TOPIC_EXCHANGE,"Email.regist",messageDTO);

            //讲数据添加到数据库

            TUser user=new TUser();
            user.setEmail(email);
            user.setPassword(SpringSecurityUtil.getEncodePassword(password));
            userMapper.insertSelective(user);

            //组织键存入redis
            String redisKey = StringUtil.getRedisKey(RedisConstant.REGISTER_EMAIL, uuid);
            redisTemplate.opsForValue().set(redisKey,email,10, TimeUnit.MINUTES);

        }catch (Exception e) {
            return ResultBean.error("注册失败");
        }
        return ResultBean.success("注册成功");
    }

    @Override
    public TUser selectByUsername(String username) {
        TUser user = userMapper.selectByUsername(username);
        return user;
    }
}
