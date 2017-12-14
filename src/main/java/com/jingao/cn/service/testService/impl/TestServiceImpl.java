package com.jingao.cn.service.testService.impl;

import com.jingao.cn.entity.test.Test;
import com.jingao.cn.entity.test.TestExample;
import com.jingao.cn.mapper.test.TestMapper;
import com.jingao.cn.service.testService.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by liKun on 2017/12/13 0013.
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public void addData() {
        TestExample testExample=new TestExample();
        List<Test> tests=testMapper.selectByExample(testExample);
//        testMapper.deleteByExample(testExample);
        long begin=System.currentTimeMillis();
        System.out.println("开始导入......");
        Test test=new Test();
        for(int i=0;i<500000;i++){
            int index=(int)(1+Math.random()*9);
            test=tests.get(index);
            test.setTest(String.valueOf(System.currentTimeMillis()+i));
            testMapper.insert(test);
        }
        System.out.println("结束导入......");
        System.out.println("耗时："+(System.currentTimeMillis()-begin)/1000+"s");
    }

    @Autowired
    TestMapper testMapper;
}
