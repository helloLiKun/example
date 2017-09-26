package com.jingao.cn.controller.admin;

import com.jingao.cn.mapping.admin.AdminMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/9/26 0026.
 */
@Controller
public class UsersController implements AdminMapping{
    @RequestMapping(WELCOME)
    public String welcome(){
        return "/admin/welcome";
    }

    @RequestMapping(REGISTER)
    public String register(){
        return "";
    }
}
