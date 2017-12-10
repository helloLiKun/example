package com.jingao.cn.service.permissionService;

import com.jingao.cn.entity.permission.PermissionTree;

import java.util.List;

/**
 * Created by liKun on 2017/12/7 0007.
 */
public interface PermissionService {
    public List<PermissionTree> getPermissionDics(String pid);
}
