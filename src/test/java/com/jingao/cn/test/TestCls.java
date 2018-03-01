package com.jingao.cn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liKun on 2017/12/22 0022.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCls {
    @Test
    public void testIntegerMax(){
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println("max:"+max+"---min:"+min);
        System.out.println("max+1:"+(max+1)+"---min-1:"+(min-1));

    }
}
