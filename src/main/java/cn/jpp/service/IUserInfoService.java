package cn.jpp.service;

import cn.jpp.entity.Userinfo;

import java.util.List;


public interface IUserInfoService {
    void add(Userinfo user);
    List<Userinfo> getCountries();
}
