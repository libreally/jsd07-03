package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.mapper.UserMapper;
import cn.tedu.coolshark.pojo.dto.UserDTO;
import cn.tedu.coolshark.pojo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @Autowired(required = false)
    UserMapper mapper;

    @RequestMapping("/login")
    public int login(@RequestBody UserDTO user, HttpServletResponse response, HttpSession session){
        System.out.println("user = " + user);
        UserVO u = mapper.selectByUsername(user.getUsername());
        if (u!=null){
            if (user.getPassword().equals(u.getPassword())){
                if (user.getRem()==null){
                    Cookie c1 = new Cookie("username", user.getUsername());
                    Cookie c2 = new Cookie("password", user.getPassword());
                    c1.setMaxAge(60*60*24);
                    c2.setMaxAge(60*60*24);
                    response.addCookie(c1);
                    response.addCookie(c2);
                }
                //把登录用户存储在Session里面
                session.setAttribute("user",u);

                return 1;
            }
            return 3;
        }
        return 2;
    }
    @RequestMapping("/currentUser")
    public UserVO currentUser(HttpSession session){
        return (UserVO) session.getAttribute("user");
    }
    @RequestMapping("/logout")
    public void logout(HttpSession session){
        session.removeAttribute("user");
    }
}
