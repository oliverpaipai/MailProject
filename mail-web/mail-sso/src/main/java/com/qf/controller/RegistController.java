package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.constant.RabbitConstant;
import com.qf.dto.ResultBean;
import com.qf.user.api.IUserService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class RegistController {

    @Reference
    private IUserService userService;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("register")
    public String register(){
        return "register";
    }

    /**
     * 发送短信验证码
     * @param phone 手机号
     * @return 结果
     */
    @RequestMapping("getCode/{phone}")
    @ResponseBody
    public ResultBean getCode(@PathVariable String phone){
        ////使用mq让第三方短信服务商来发送短信
        rabbitTemplate.convertAndSend(RabbitConstant.SMS_TOPIC_EXCHANGE,"regist.sms",phone);
        return ResultBean.success();
    }

    /**
     * 实现注册
     * @param phone
     * @param code
     * @param password
     * @return ResultBean 返回的结果包含了验证码错误的结果
     */
    @RequestMapping("doRegist/{phone}/{code}/{password}")
    @ResponseBody
    public String doRegis(@PathVariable String phone,@PathVariable Integer code,@PathVariable String password){

        userService.regist(phone,code,password);
        return "user/login";
    }

    @RequestMapping("registByEmail")
    public String registByEmail(String email,String password){
        ResultBean resultBean = userService.registByEmail(email, password);
        return "redirect:/user/showLogin";
    }

}
