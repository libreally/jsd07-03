package cn.tedu.boot02.controller;

import cn.tedu.boot02.entity.User;
import cn.tedu.boot02.util.DBUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Controller
public class UserController {
    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){
        try( Connection connection = DBUtil.getConnection()) {
           String sql="select password from user where username=? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                String pw=rs.getString(1);
                if (pw.equals(user.getPassword())){
                    return "登录成功";
                }
                return "密码错误";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "登录失败,用户不存在";
    }
}
