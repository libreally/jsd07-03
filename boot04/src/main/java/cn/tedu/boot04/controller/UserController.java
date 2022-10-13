package cn.tedu.boot04.controller;

import cn.tedu.boot04.entity.User;
import cn.tedu.boot04.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserMapper mapper;

    @RequestMapping("/reg")
    public String reg(User user) {
        System.out.println("user = " + user);
        User u = mapper.selectByUsername(user.getUsername());
        if (u != null) {
            return "用户已存在<a href='/reg.html'>重新注册</a>";
        }
        mapper.insert(user);
        return "<h1>注册成功<a href='/'>返回首页</a></h1>";
    }

    @RequestMapping("/login")
    public String login(User user) {
        System.out.println("user = " + user);
        User u = mapper.selectByUsername(user.getUsername());
        if (u != null) {
            if (user.getPassword().equals(u.getPassword())) {
                return "<h1>登陆成功<a href='/'>返回首页</a></h1>";
            } else {
                return "密码错误<a href='/login.html'>重新登陆</a>";
            }
        }
        return "用户不存在<a href='/reg.html'>请注册</a>";
    }

    @RequestMapping("/check")
    public String reg(String username){
        System.out.println("username = " + username);
        User u = mapper.selectByUsername(username);
        return u==null?"用户名可用":"用户名已存在";
    }
}
