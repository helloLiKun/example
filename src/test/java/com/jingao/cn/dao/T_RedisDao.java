package com.jingao.cn.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class T_RedisDao {
    public static Logger logger= LoggerFactory.getLogger(T_RedisDao.class);
    @Test
    public void contextLoads() {
    }

    @Autowired
    Redis redisDao;
    @Test
    public void testRedis(){
        redisDao.setKey("name","forezp");
        redisDao.setKey("age","11");
        redisDao.setKey("sal","3000");
        logger.info(redisDao.getValue("height"));
        logger.info(redisDao.getValue("age"));
    }
}
