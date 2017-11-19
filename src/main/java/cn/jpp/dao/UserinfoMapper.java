package cn.jpp.dao;

import cn.jpp.entity.Userinfo;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserinfoMapper {
    int insert(Userinfo record);
    List<Userinfo> getCountries();
}