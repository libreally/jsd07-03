package cn.tedu.weibo.controller;

import cn.tedu.weibo.mapper.UserMapper;
import cn.tedu.weibo.pojo.dto.UserDTO;
import cn.tedu.weibo.pojo.dto.UserLoginDTO;
import cn.tedu.weibo.pojo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/reg")
    public int reg(@RequestBody UserDTO user){
        System.out.println("userDTO = " + user);
        UserVO u = userMapper.selectByUsername(user.getUsername());
        if (u!=null){
            return 2;
        }
        userMapper.insert(user);
        return 1;
    }
    @RequestMapping("/login")
    public int login(@RequestBody UserLoginDTO user , HttpSession session, HttpServletResponse response){
        System.out.println("userLoginDTO = " + user);
        UserVO u = userMapper.selectByUsername(user.getUsername());
        if (u!=null){
            if (user.getPassword().equals(u.getPassword())){
                session.setAttribute("user",u);
                //是否记住用户命名和密码
                if (user.getRem()){
                    //创建Cookie
                    Cookie c1 = new Cookie("username", user.getUsername());
                    //设置保存时常
                    c1.setMaxAge(60*60*24*30);
                    Cookie c2 = new Cookie("password", user.getPassword());
                    c2.setMaxAge(60*60*24*30);
                    //将cookie下发给客户端
                    response.addCookie(c1);
                    response.addCookie(c2);
                }
                return 1;
            }
            return 3;
        }
        return 2;
    }

    /**
     * 获取当前登陆用户信息
     */
    @RequestMapping("/currentUser")
    public UserVO currentUser(HttpSession session){
        return (UserVO) session.getAttribute("user");
    }
    /**
     * 退出页面功能
     */
    @RequestMapping("/logout")
    public void logout(HttpSession session){
        session.removeAttribute("user");
    }
}
