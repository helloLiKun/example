package com.jingao.cn.service.permissionService;

import com.jingao.cn.entity.permission.PermissionDic;

import java.util.List;

/**
 * Created by liKun on 2017/12/7 0007.
 */
public interface PermissionService {
    public List<PermissionDic> getPermissionDics(String pid);
}
