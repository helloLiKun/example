package com.jingao.cn.shortMessage;

import com.jingao.cn.service.shortMessage.ShortMessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * Created by liKun on 2017/12/19 0019.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShortMessageServiceTest {
    @Autowired
    ShortMessageService shortMessageService;
    @Test
    public void sendShortMessage(){
        try {
            shortMessageService.sendShorMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
