package com.jingao.cn.service.permissionService.impl;

import com.jingao.cn.entity.permission.PermissionTree;
import com.jingao.cn.entity.permission.PermissionTreeExample;
import com.jingao.cn.mapper.permission.PermissionTreeMapper;
import com.jingao.cn.service.permissionService.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liKun on 2017/12/7 0007.
 */
@Service
public class PermissionServiceImpl  implements PermissionService {
    @Override
    public List<PermissionTree> getPermissionDics(String pid) {
        PermissionTreeExample permissionTreeExample=new PermissionTreeExample();
        PermissionTreeExample.Criteria c=permissionTreeExample.createCriteria();
        c.andPidEqualTo(pid);
        return permissionTreeMapper.selectByExample(permissionTreeExample);
    }



    @Autowired
    PermissionTreeMapper permissionTreeMapper;

}
