package cn.tedu.boot011.controller;

import cn.tedu.boot011.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class param {
    @RequestMapping("/param1")
    @ResponseBody
    public String param(HttpServletRequest request){
        String info = request.getParameter("info");
        return "接收到消息:"+info;
    }
    @RequestMapping("/param2")
    @ResponseBody
    public String param2(String name,int age){
        return "姓名:"+name+" 年龄:"+age;
    }
    @RequestMapping("/param3")
    @ResponseBody
    public String param2(Emp emp){
        return emp.toString();
    }
}
