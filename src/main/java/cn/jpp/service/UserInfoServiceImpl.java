package cn.jpp.service;

import cn.jpp.dao.UserinfoMapper;
import cn.jpp.entity.Userinfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserInfo")
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private UserinfoMapper userMapper;

    public void add(Userinfo user) {
        userMapper.insert(user);
    }

    public List<Userinfo> getCountries() {
        PageHelper.startPage(1, 20);
        List<Userinfo> list = userMapper.getCountries();
        List<Userinfo> pageInfo = new PageInfo<Userinfo>(list).getList();
        return pageInfo;
    }
}
