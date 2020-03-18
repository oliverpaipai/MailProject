package com.qf.service.controller;

import com.qf.constant.RedisConstant;
import com.qf.dto.ResultBean;
import com.qf.entity.TUser;
import com.qf.user.api.IUserService;
import com.qf.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("email")
public class EmailController {

    @Reference
    private IUserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("active")
    public ResultBean activeEmail(String uuid){
        String redisKey = StringUtil.getRedisKey(RedisConstant.REGISTER_EMAIL, uuid);
        String addr = (String) redisTemplate.opsForValue().get(redisKey);
        TUser user = userService.selectByUsername(addr);
        user.setFlag(true);




        return ResultBean.success("激活成功");
    }
}
