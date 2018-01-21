package com.jingao.cn.controller.test;

import com.jingao.cn.service.testService.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liKun on 2017/12/13 0013.
 */
@Controller
public class TestController {
    @RequestMapping("/add")
    public String addData(){
        return "";
    }
    @Autowired
    TestService testService;
}
