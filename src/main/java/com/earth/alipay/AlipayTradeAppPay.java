package com.earth.alipay;

import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayConfig;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;

public class AlipayTradeAppPay {

    public static void main(String[] args) throws Exception {
        String privateKey = "<-- 当前帐号未登录，登录后会自动填充当前沙箱帐号的应用私钥 -->";
        String alipayPublicKey = "<-- 当前帐号未登录，登录后会自动填充当前沙箱帐号的支付宝公钥 -->";
        AlipayConfig alipayConfig = new AlipayConfig();
        alipayConfig.setServerUrl("https://openapi.alipaydev.com/gateway.do");
        //alipayConfig.setAppId("<-- 当前帐号未登录，登录后会自动填充当前沙箱帐号的AppId -->");
        alipayConfig.setPrivateKey(privateKey);
        alipayConfig.setFormat("json");
        alipayConfig.setAlipayPublicKey(alipayPublicKey);
        alipayConfig.setCharset("UTF8");
        alipayConfig.setSignType("RSA2");
        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig);
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setOutTradeNo("70501111111S001111119");
        model.setTotalAmount("9.00");
        model.setSubject("大乐透");
        request.setBizModel(model);
        AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
        System.out.println(response.getBody());
        if (response.isSuccess()) {
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }
    }
}
