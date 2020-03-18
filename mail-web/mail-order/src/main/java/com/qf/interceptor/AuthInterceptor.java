package com.qf.interceptor;

import com.qf.constant.CookieConstant;
import com.qf.constant.RedisConstant;
import com.qf.entity.TUser;
import com.qf.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthInterceptor {

    @Autowired
    private RedisTemplate redisTemplate;

    //获取cookie中的uuid
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handel)throws Exception {
        Cookie[] cookies=request.getCookies();
        for (Cookie cookie : cookies) {
            if(CookieConstant.USER_LOGIN.equals(cookie.getName())){
                String uuid = cookie.getValue();
                String redisKey = StringUtil.getRedisKey(RedisConstant.USER_LOGIN_PRE, uuid);
                Object o = redisTemplate.opsForValue().get(redisKey);
                if (o!=null){
                    TUser user=(TUser) o;
                    request.setAttribute("user",user);
                    return true;
                }
            }
        }
        return true;
    }

}
