package cn.jpp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/say")
public class ViewController {
    @RequestMapping(value = "hello")
    public ModelAndView hello(HttpServletRequest request, HttpServletResponse resp) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World!");
        mv.setViewName("hello");
        return mv;
    }
}
