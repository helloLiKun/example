package com.jingao.cn.service.mail;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liKun on 2017/12/18 0018.
 */

public interface MailService {
    void  sendMail() throws Exception;
}
