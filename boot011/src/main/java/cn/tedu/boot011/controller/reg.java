package cn.tedu.boot011.controller;

import cn.tedu.boot011.entity.Person;
import cn.tedu.boot011.util.DBUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Controller
public class reg {
    @RequestMapping("/reg")
    @ResponseBody
    public String reg(Person p, HttpServletResponse response) {
        System.out.println("p = " + p);
        try (Connection connection = DBUtil.getConnection()) {
            String sql = "insert into bbsdb.user values(null,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, p.getUsername());
            ps.setString(2, p.getPassword());
            ps.setString(3, p.getNickname());
            ps.setString(4, p.getAge());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "注册成功";
    }
}
