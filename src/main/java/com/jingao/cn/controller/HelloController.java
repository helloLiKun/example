package com.jingao.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/9/22 0022.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "/hello";
    }
}
