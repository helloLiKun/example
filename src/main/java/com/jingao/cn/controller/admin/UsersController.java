package com.jingao.cn.controller.admin;

import com.alibaba.fastjson.JSON;
import com.jingao.cn.entity.admin.Users;
import com.jingao.cn.mapping.admin.AdminMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/9/26 0026.
 */
@Controller
public class UsersController implements AdminMapping{
    @RequestMapping(LOGIN)
    public String welcome(ModelMap modelMap){
        Users users=new Users();
        users.setName("zhangsan");
        users.setPwd("123");
        modelMap.put("usermsgJSON", JSON.toJSONStringWithDateFormat(users,"yyyy-MM-dd"));
        modelMap.put("loginSubmitUrlJSON",LOGINSUBMIT);
        return "/admin/login";
    }

    @RequestMapping(LOGINSUBMIT)
    public String login(){
        return "/admin/main";
    }

    @RequestMapping(REGISTER)
    public String register(){
        return "";
    }
}
