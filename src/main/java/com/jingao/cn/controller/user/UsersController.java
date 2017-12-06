package com.jingao.cn.controller.user;

import com.alibaba.fastjson.JSON;
import com.jingao.cn.entity.user.Users;
import com.jingao.cn.mapping.user.UserMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/9/26 0026.
 */
@Controller
public class UsersController implements UserMapping {
    @RequestMapping(LOGIN)
    public String welcome(ModelMap modelMap){
        Users users=new Users();
        users.setName("zhangsan");
        users.setPwd("123");
        modelMap.put("usermsgJSON", JSON.toJSONStringWithDateFormat(users,"yyyy-MM-dd"));
        modelMap.put("loginSubmitUrlJSON",LOGINSUBMIT);
        return "login";
    }

    @RequestMapping(LOGINSUBMIT)
    public String login(){
        return "main";
    }

    @RequestMapping(REGISTER)
    public String register(){
        return "";
    }
}
