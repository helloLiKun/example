package com.jingao.cn.controller.permission;

import com.jingao.cn.mapping.permission.PermissionMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liKun on 2017/12/7 0007.
 */
@Controller
public class PermissionController implements PermissionMapping{
    @RequestMapping(ZTREE)
    public String toZtree(){
        return "tree/Ztree";
    }

    @RequestMapping(INITZTREE)
    @ResponseBody
    public String initZtree(@RequestParam("pid")String pid){
        return null;
    }
}
