package com.qf.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.alipay.api.response.AlipayTradeRefundResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Controller
public class AliPayController {

    @RequestMapping("success")
    public String getSuccess(){
        return "success";
    }

    @RequestMapping("pay")
    public String showPay(){
        return "pay";
    }

    @RequestMapping("doPay")
    public void doPay(HttpServletRequest httpRequest,
                      HttpServletResponse httpResponse,String oid) throws IOException {
        /**
         *参数说明：
         * 1. 支付网关
         * 2.应用id
         * 3.商户应用私钥
         * 4.返回的数据类型： json
         * 5.字符集： utf-8
         * 6. 支付宝公钥  注意，是支付宝公钥，不是商户公钥
         * 7. 密钥生成方式： RSA2
         */
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do",
                "2016101900725618",
                "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDslOomV0+KQIEltL4fevX2kxg9unEwh7KEtA19RhPuTSRRiOieEJp2XAK5rze/8Yz4KkvLHljZozfbM4yGdP1EXXrLO8JCm+WD3tqpS8rBvgKe+4mtCoUSID006AjFVeJIIW/Zx5DVynzTcfvrgq+SzHgiVy+6ec/oTKTo+tGIILUswqilZDV1NqRl0Dct3NMfnb3zD0X9FY/38YQg95tx+Cvc9qe6Mi86Z7Ye1gkCOcdao2lFUrs3S6GzOw1PtQhay3C13OWhve45WuWX0frYkqGNcDxkN2cun5+q+q29sA6RLGRlbthgfaFPI611anKYo7p8FZOBgodBT/ZzfKQrAgMBAAECggEAOasG9Hed7N5SXMWU/olzgTpT02AqDSFWs6BMFXhKjXECZFmSEk2LyUQeafK7DS+tJCTzOrzX/Z0alXUYUQIdZle/AeE8Ng5YQO/GrzPJZbaSXvyDj8mbrFJteQMCeE+6C8kSwawystpb2RLUzJCbiZYLxpsoCDV/J2nfXOcewiZ23t+m6ZTGMGUXE+8CFBEfyeYDxQswaoqzADaZSXSUzdwfQm1MXq3Nfws67hDutYNJY7OLHkTWdTARPzq0davshWY+I+WGld9fmRtxJDXiyRaspQqBJD7e+9KjuLHM7thKJPMqsdyrtj1NklpUL50DojcbGG0t4d7hOEBN6nVGeQKBgQD8eOff6vmsrMpjz217eE+0w7hST2qD++Et5bR7yu9yuadLTPBlxrMoFq76r98Dfpd1XndT92Ff2dt70vB2EVlb5j+gKRHxjxkXl0Mvn6JmHQdsnJTiidGpoVVqiUoclwTJknorJFQw4USB6UG2o9CTS98b3dnlR79pLawHQ+qldwKBgQDv4ysOk91r5y+78qP0d/rUDO2M7BwGWxZT044MEavRkZnB1XO2PsdxNjPu3nxB35X3bYCaJ7EVuEJ0HyRwrmpA26OWUBAwm+pAV7hC/tHd2vILMz8GGCAsDKm1QzCQoL6ECJg8mmPIisLL+iXenzL4tj/AQxxAIgA4MggOW7tz7QKBgQDUy/t0ahMDDaiQs9atiNx1mbmT9sfqcrR7AO88n/Fumzh8aV7+CZobofLd7LplsZ9rF7IwHYP/TBqIpWRzv2+327uo/LTZCym1DpNcYop40uLdEqUSw+LpvMfHweuraUZpt4ItNrOXd2dMsBPpIu28GOj2DemILQ8SUaJ7hS0TRQKBgQC8ZM7y0uOJE3Ykh+mFXBisIj8JdoCH6U8+pB2hkts6abu0Q7ttPB6L5cKhbS9u2HZBbEkcR+HGKgBei/qlWATwTM5LhTNByaENyRZX3yHYt1NxwlxTn+zcS1GYnlzsqKEWtl1A8ws8euWDJkBJdwOj2hV1G/96ynkbqQc0p4wu/QKBgQCFHcxc+UbRgv5scFKeZYIy74RrY8LJmk5necaXXxO1I2dxWyWcRGP3s2PcT2497eXyE0uWtUzlcaMtPLKSnIEIg2/SzpvBXu7CfZp8jEkVk/+5hFJrP15htBvDti/7xW5g6Rui6TlXJP9kC/2FVuy45LeAd0L143gRIdr2NHwkgw==",
                "JSON",
                "utf-8",
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAp9UChDZQVdCnjEUYD8krUzXIyhnNm9/K4+FIGpR+3WK9OSyjWI3NYcxqh2CvFWpayJTN7OvOrW/qPXaJGlNO2es4TIwJvuwnjNqer2xSzlL0GiR5zLH+Zf7ZME77rR23Wb560DEzZF3UtOpSxaYbduettK7j24BkPLEzV9aC79Pt5TcSVAcDgDX9aDDnJk5hBM9K1Qw47R7J7n6MlhEFsK09Z8SNk41djCxfD3f1CwgclhIfJxlHuwmocuhq2WL00SdfTm3Ouri9aRoIPU0R2PlmG2YBmHM6UgqLqJvglEBH3lGOEU8yBkaSjzibqyYZydhWopjbaq6UCsZlUkVONwIDAQAB",
                "RSA2"); //获得初始化的AlipayClient
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();//创建API对应的request
        alipayRequest.setReturnUrl("http://bjn8pw.natappfree.cc/success");
        alipayRequest.setNotifyUrl("http://bjn8pw.natappfree.cc/notrfy");//在公共参数中设置回跳和通知地址
        alipayRequest.setBizContent("{" +
                "    \"out_trade_no\":\""+oid+"\"," +
                "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
                "    \"total_amount\":100000," +
                "    \"subject\":\"Iphone16 16G\"," +
                "    \"body\":\"Iphone16 16G\"," +
                "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\"," +
                "    \"extend_params\":{" +
                "    \"sys_service_provider_id\":\"2088511833207846\"" +
                "    }"+
                "  }");//填充业务参数
        String form="";
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        httpResponse.setContentType("text/html;charset=utf-8");
        httpResponse.getWriter().write(form);//直接将完整的表单html输出到页面
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();
    }

    @RequestMapping(value = "notrfy",method = RequestMethod.POST)
    @ResponseBody
    public void notifyUrl(HttpServletRequest request,HttpServletResponse response) throws AlipayApiException, IOException {

        Map<String, String[]> map = request.getParameterMap();
        //需要将map中的String[]==>String
        Map<String, String> paramsMap = new HashMap<>(); //将异步通知中收到的所有参数都存放到 map 中
        Set<Map.Entry<String, String[]>> entries = map.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            String[] values = entry.getValue();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < values.length-1; i++) {
                sb.append(values[i]+",");
            }
            sb.append(values[values.length-1]);
            paramsMap.put(entry.getKey(),sb.toString());
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(paramsMap,
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAovePsqV6HCfcrhxQBIiBeVdSVigCY9zMsSTXV3B8nTB2M2YMPy9fOE+hVdDOTxNlW1uTXUneP1/JJKpCHLN4VT3zRYNDCehu2ow4yg6vv+6m9aiK0E0vl1BvWykLuwC8MfveqYazGXRGos165jgPFcyN9LIG4ztL6vrHH8etIaElu7AdeaQnBox3b+puWlmGOmiLq83MtLxcHZHCuw4yqZrZTNnOsZyqgWgp+xPXVfhUD7HsuQcXiv47FboSt6yaVQpmSXXYHo68Idr3mxYPM6X4pZyQwuLkoYBB4sJPmwE2525sJSWOP9nwQG3ypAT6+kLk5kYK1IurtpVP5g2m2wIDAQAB",
                "utf-8",
                "RSA2"); //调用SDK验证签名
        if(signVerified){
            // TODO 验签成功后，按照支付结果异步通知中的描述，对支付结果中的业务内容进行二次校验，校验成功后在response中返回success并继续商户自身业务处理，校验失败返回failure
            if(paramsMap.get("out_trade_no").equals("6554613123")&&
                    paramsMap.get("total_amount").equals("100000")){
                System.out.println("金额正确，验签成功");//要去数据库中改变订单状态
                //TODO response.getWriter().write("json");

            }
        }else{
            // TODO 验签失败则记录异常日志，并在response中返回failure.

        }
    }

    //退款
    @RequestMapping("refund")
    public void refund() throws AlipayApiException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do","app_id","your private_key","json","GBK","alipay_public_key");
        AlipayTradeRefundRequest request = new AlipayTradeRefundRequest();
        request.setBizContent("{" +
                "    \"out_trade_no\":\"20150320010101001\"," +
                "    \"trade_no\":\"2014112611001004680073956707\"," +
                "    \"refund_amount\":200.12," +
                "    \"refund_reason\":\"正常退款\"," +
                "    \"out_request_no\":\"HZ01RF001\"," +
                "    \"operator_id\":\"OP001\"," +
                "    \"store_id\":\"NJ_S_001\"," +
                "    \"terminal_id\":\"NJ_T_001\"" +
                "  }");
        AlipayTradeRefundResponse response = alipayClient.execute(request);
        if(response.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }
    }
}
/**
 *
 * http://bjn8pw.natappfree.cc/success?charset=utf-8&out_trade_no=7778899&method=alipay.trade.page.pay.return&total_amount=100000.00&sign=NQzgJWqz9e0fobIV0S%2Br%2BAdX6m83dyy7zbDIAgC4le1xEI8yZKGTQUr81%2FrkKea8i%2BnLGpFaxBk3DjpGgv9UutXb1RVfO9bxdIxRpws6kl%2Bl9vcftlTMf6wGrN6FwReKfykWk8vbttkIMl2%2F53%2B2Q4fSvYVRB%2BhDBBppLUusp54rvRgcp7mcN7zV9QDPv6bN967GbioX7W7yeTNSFhiB30GpYF5Ph2ci8vLHBb9sklbf%2Fh3dRDu00vRm9efzq9Ni5noPJXQ5pwYGYP7EfTLuqeYz%2F2PnYKHq2CFyWF28y8nFahHYmGMEea4YFT7vZCtvK251lrjfJDsQTEino2YVPQ%3D%3D&trade_no=2020031722001482620501188429&auth_app_id=2016101900725618&version=1.0&app_id=2016101900725618&sign_type=RSA2&seller_id=2088102180327248&timestamp=2020-03-17+21%3A18%3A13
 */