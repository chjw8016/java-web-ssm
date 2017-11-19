package cn.jpp.service;

import cn.jpp.dao.RoleMapper;
import cn.jpp.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("roleService")
public class RoleServiceLmpl implements IRoleService {
    @Autowired
    private RoleMapper roleMapper;

    public void add(Role role) {
        roleMapper.insert(role);
    }
}
