package com.jingao.cn.mail;

import com.jingao.cn.service.mail.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liKun on 2017/12/18 0018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMail {
    @Autowired
    MailService mailService;

    @Test
    public void testSendMail(){
        try {
            mailService.sendMail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
