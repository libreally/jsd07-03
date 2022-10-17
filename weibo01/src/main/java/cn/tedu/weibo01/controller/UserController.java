package cn.tedu.weibo01.controller;

import cn.tedu.weibo01.mapper.UserMapper;
import cn.tedu.weibo01.pojo.dto.UserDTO;
import cn.tedu.weibo01.pojo.dto.UserLoginDTO;
import cn.tedu.weibo01.pojo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @Autowired(required = false)
    UserMapper mapper;

    @RequestMapping("/reg")
    public int reg(@RequestBody UserDTO user){
        System.out.println("user = " + user);
        UserVO u = mapper.selectSelectByUsername(user.getUsername());
        if (u!=null){
            return 2;
        }
        mapper.insert(user);
        return 2;
    }
    @RequestMapping("/login")
    public int login(@RequestBody UserLoginDTO user, HttpSession session){
        System.out.println("user = " + user);
        UserVO u = mapper.selectSelectByUsername(user.getUsername());
        if (u!=null){
            if (user.getPassword().equals(u.getPassword())){
                //存入登录成功的对象
                session.setAttribute("user",u);
                return 1;
            }
            return 3;
        }
        return 2;
    }

    /**
     * 获取登陆对象信息
     * @param session
     * @return
     */
    @RequestMapping("/currentUser")
    public UserVO currentUser(HttpSession session){
        return (UserVO) session.getAttribute("user");
    }

    @RequestMapping("/logout")
    public  void logout(HttpSession session){
       session.removeAttribute("user");
    }
}
