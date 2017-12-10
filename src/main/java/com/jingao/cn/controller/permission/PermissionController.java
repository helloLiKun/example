package com.jingao.cn.controller.permission;

import com.alibaba.fastjson.JSON;
import com.jingao.cn.entity.permission.PermissionTree;
import com.jingao.cn.mapping.permission.PermissionMapping;
import com.jingao.cn.service.permissionService.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by liKun on 2017/12/7 0007.
 */
@Controller
public class PermissionController implements PermissionMapping{
    @RequestMapping(ZTREE)
    public String toZtree(ModelMap map){
        List<PermissionTree> permissionTreeList=permissionService.getPermissionTree("0");
        map.put("getTreeURL",INITZTREE);
        map.put("initPermissionJSON",JSON.toJSONString(permissionTreeList));
        return "tree/Ztree";
    }

    @RequestMapping(INITZTREE)
    @ResponseBody
    public String initZtree(@RequestParam("id")String id){
        List<PermissionTree> permissionTreeList=permissionService.getPermissionTree(id);
        return JSON.toJSONString(permissionTreeList);
    }

    @Autowired
    PermissionService permissionService;
}
