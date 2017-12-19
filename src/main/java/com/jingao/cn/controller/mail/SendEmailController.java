package com.jingao.cn.controller.mail;

import com.jingao.cn.mapping.mail.SendEmailMapping;
import org.apache.http.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.*;
import java.util.Properties;


/**
 * Created by liKun on 2017/12/18 0018.
 */
@Controller
public class SendEmailController implements SendEmailMapping {
    @RequestMapping(SENDEMAIL)
    public String sendEmail(HttpResponse response){
        // 收件人的电子邮件 ID
        String from = "13923813589@163.com";

        // 发件人的电子邮件 ID
        String to = "1281509283@qq.com";

        // 假设您是从本地主机发送电子邮件
        String host = "smtp.163.com";

        // 获取系统的属性
        Properties properties = System.getProperties();

        // 设置邮件服务器
//        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.host",host);
        // 获取默认的 Session 对象
        Session session = Session.getDefaultInstance(properties);

        // 创建一个默认的 MimeMessage 对象
        MimeMessage message = new MimeMessage(session);
        try {
            // 设置 From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // 设置 To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
            // 设置 Subject: header field

            message.setSubject("This is the Subject Line!");

            // 现在设置实际消息
            message.setText("This is actual message");
            // 发送消息
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return "";


    }




}
