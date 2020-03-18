package com.qf;

import com.qf.constant.RedisConstant;
import com.qf.dto.ResultBean;
import com.qf.entity.TUser;
import com.qf.util.SpringSecurityUtil;
import com.qf.util.StringUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class MailUserServiceApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        Integer code=236128;
        String phone="15319628298";
        String redisKey = StringUtil.getRedisKey(RedisConstant.REGISTER_PHONE, phone);
        Integer redisCode = (Integer) redisTemplate.opsForValue().get(redisKey);
        System.out.println(redisCode+"+++++");
        if(code.equals(redisCode)){//验证码正确

            System.out.println("注册成功");

        }
    }

}
