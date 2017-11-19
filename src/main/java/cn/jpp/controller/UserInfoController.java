package cn.jpp.controller;

import cn.jpp.entity.Message;
import cn.jpp.entity.Userinfo;
import cn.jpp.service.IAccountService;
import cn.jpp.service.IUserInfoService;
import com.alibaba.fastjson.JSON;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/hello")
public class UserInfoController {
    @Autowired
    private IUserInfoService service;
    @Autowired
    private IAccountService accountService;

    private static Log LOG = LogFactory.getLog(UserInfoController.class);

    @RequestMapping(value = "post_ajax.do")
    public @ResponseBody
    String AddData(HttpServletRequest request,
                   HttpServletResponse response) throws Exception {
        Userinfo u1 = new Userinfo();
        u1.setAge(Integer.valueOf(request.getParameter("age")));
        u1.setName(request.getParameter("name"));
        u1.setRoleId(1);
        service.add(u1);
        return JSON.toJSONString(u1);
    }

    @RequestMapping(value = "get_ajax.do")
    public @ResponseBody
    String GetData(HttpServletRequest request,
                   HttpServletResponse response) throws Exception {
        Integer id = Integer.valueOf(request.getParameter("id"));
        List<Userinfo> list = service.getCountries();

        return JSON.toJSONString(list);
    }

    @RequestMapping(value = "transfer")
    public @ResponseBody
    String transfer() {
        String result = accountService.transfer("张三", "李四", 1);
        Message message = new Message();
        message.setCode(400100);
        message.setMessage(result);
        return JSON.toJSONString(message);
    }
}
