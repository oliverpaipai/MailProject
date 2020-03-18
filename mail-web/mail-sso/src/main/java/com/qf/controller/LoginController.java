package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.constant.CookieConstant;
import com.qf.constant.RedisConstant;
import com.qf.dto.ResultBean;
import com.qf.user.api.IUserService;
import com.qf.util.HttpClientUtils;
import com.qf.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("user")
@CrossOrigin(origins = "*", maxAge = 3600,allowCredentials = "true")
public class LoginController {

    @Reference
    private IUserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("showLogin")
    public String login() {
        return "login";
    }

    /**
     * 验证用户名和密码是否正确
     *
     * @param uname
     * @param password
     * @return
     */
    @RequestMapping("checkLogin")
    public String checkLogin(String uname, String password, HttpServletResponse response
            , @CookieValue(name = CookieConstant.USER_CART, required = false) String userCartUuid) {


        ResultBean resultBean = userService.checkLogin(uname, password);
        if(resultBean.getErrno()==0){
            //登录成功
            //生成cookie
            String uuid = UUID.randomUUID().toString();
            Cookie cookie = new Cookie(CookieConstant.USER_LOGIN,uuid);
            //往redis里存
            //组织键
            String key = StringUtil.getRedisKey(RedisConstant.USER_LOGIN_PRE, uuid);
            //把登录成功后的用户对象存入到redis中。以便checkIsLogin接口去判断是否已登录 来使用
            redisTemplate.opsForValue().set(key,resultBean.getData(),30, TimeUnit.DAYS);
            //cookie要发送给客户端
            cookie.setMaxAge(30*24*60*60);
            cookie.setPath("/");
            cookie.setHttpOnly(true);
            response.addCookie(cookie);

            //===========合并购物车的Http请求===========
            //因为使用HttpClient来发送请求，所以Cookie不能像浏览器发送请求一样自动携带，因此需要我们手动携带Cookie
            //Cookie: user_cart=3b0c227d-9616-4098-b9f3-71cd1405150e; user_login=92cd6c37-36ea-426c-8a72-a826ae9ef579
           /* String url = "http://localhost:8092/cart/merge";
            StringBuilder sb = new StringBuilder();
            sb.append(CookieConstant.USER_CART);
            sb.append("=");
            sb.append(userCartUuid);
            sb.append(";");
            sb.append(CookieConstant.USER_LOGIN);
            sb.append("=");
            sb.append(uuid);
            HttpClientUtils.doGet(url,sb.toString());*/


            return "redirect:http://localhost:8091";

        }

        return "redirect:showLogin";


    }

    /**
     * 判断用户是否已登录
     */
    @RequestMapping("checkIsLogin")
    @ResponseBody
    public ResultBean checkIsLogin(@CookieValue(name = CookieConstant.USER_LOGIN,required = false) String uuid, HttpServletRequest request){


        return userService.checkIsLogin(uuid);

    }

    /**
     * 注销
     */
    @RequestMapping("logout")
    @ResponseBody
    public ResultBean logout(@CookieValue(name=CookieConstant.USER_LOGIN,required = false) String uuid,
                             HttpServletResponse response){
        //1.redis中删除
        //uuid有可能是空的，注销成功
        if(uuid!=null&&!"".equals(uuid)){
            String redisKey = StringUtil.getRedisKey(RedisConstant.USER_LOGIN_PRE, uuid);
            redisTemplate.delete(redisKey);
        }
        //2.cookie要删除
        //cookie如何删除？
        //cookie的键  path 是一样的
        Cookie cookie = new Cookie(CookieConstant.USER_LOGIN,"");
        cookie.setMaxAge(0);//删除cookie
        cookie.setPath("/");
        cookie.setHttpOnly(true);//只有后端程序能访问，提高cookie的安全性
        response.addCookie(cookie);
        return ResultBean.success("注销成功");
    }

}
