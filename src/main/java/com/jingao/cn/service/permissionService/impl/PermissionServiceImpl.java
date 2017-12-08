package com.jingao.cn.service.permissionService.impl;

import com.jingao.cn.entity.permission.PermissionDic;
import com.jingao.cn.entity.permission.PermissionDicExample;
import com.jingao.cn.mapper.permission.PermissionDicMapper;
import com.jingao.cn.service.permissionService.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liKun on 2017/12/7 0007.
 */
@Service
public class PermissionServiceImpl  implements PermissionService{
    @Override
    public List<PermissionDic> getPermissionDics(String pid) {
        PermissionDicExample permissionDicExample=new PermissionDicExample();
        PermissionDicExample.Criteria c=permissionDicExample.createCriteria();
        c.andPidEqualTo(pid);
        return permissionDicMapper.selectByExample(permissionDicExample);
    }


    @Autowired
    PermissionDicMapper permissionDicMapper;
}
