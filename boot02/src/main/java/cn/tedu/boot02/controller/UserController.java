package cn.tedu.boot02.controller;

import cn.tedu.boot02.entity.User;
import cn.tedu.boot02.util.DBUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Controller
public class UserController {
    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){
        try( Connection connection = DBUtil.getConnection()) {
           String sql="select username,password from user where username=? and password=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2, user.getPassword());
            ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "登录成功";
    }
}
