package com.jingao.cn.service.shortMessage.impl;

/**
 * Created by liKun on 2017/12/19 0019.
 */

import com.jingao.cn.service.shortMessage.ShortMessageService;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ShortMessageImple implements ShortMessageService {


    @Override
    public void sendShorMessage() throws IOException {
        HttpClient client = new HttpClient();
        PostMethod post = new PostMethod("http://utf8.api.smschinese.cn");
        post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=utf8");//在头文件中设置转码
        NameValuePair[] data ={ new NameValuePair("Uid", "lk1392381****"),new NameValuePair("Key", "a2cb2e****43db"),new NameValuePair("smsMob","1509988****"),new NameValuePair("smsText","通知：你大yeye喊你吃饭【天鸿科技】")};
        post.setRequestBody(data);
        client.executeMethod(post);
        Header[] headers = post.getResponseHeaders();
        int statusCode = post.getStatusCode();
        System.out.println("statusCode:"+statusCode);
        for(Header h : headers)
        {
            System.out.println("h:"+h.toString());
        }
        String result = new String(post.getResponseBodyAsString().getBytes("utf8"));
        System.out.println("result:"+result); //打印返回消息状态
        post.releaseConnection();
    }
}