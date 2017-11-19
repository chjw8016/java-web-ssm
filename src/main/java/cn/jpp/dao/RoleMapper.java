package cn.jpp.dao;

import cn.jpp.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    int insert(Role record);
}