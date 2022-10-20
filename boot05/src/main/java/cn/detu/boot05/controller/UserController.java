package cn.detu.boot05.controller;

import cn.detu.boot05.entity.User;
import cn.detu.boot05.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserMapper mapper;

    /**
     * 注册
     */
    @RequestMapping("/reg")
    public int reg(@RequestBody User user){
        User u = mapper.selectByUsername(user.getUsername());
        if (u!=null){
            return 2;
        }
        mapper.insert(user);
        return 1;
    }

    /**
     * 登陆
     * @param user
     * @return
     */
    @RequestMapping("/login")
    public int login(@RequestBody User user) {
        System.out.println("user = " + user);
        User u = mapper.selectByUsername(user.getUsername());
        if (u != null) {
            if (user.getPassword().equals(u.getPassword())) {
                return 1;
            } else {
                return 2;
            }
        }
        return 3;
    }
    @RequestMapping("/check")
    public String check(@RequestBody User user) {
        User u = mapper.selectByUsername(user.getUsername());
            return u==null?"用户名可用":"用户名已存在";
    }
}
