package cn.tedu.boot02.controller;

import cn.tedu.boot02.entity.Product;
import cn.tedu.boot02.util.DBUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Controller
public class ProductController {
    @RequestMapping("/insert")
    @ResponseBody
    public String insert(Product product) {
        System.out.println("product = " + product);
        try (Connection connection = DBUtil.getConnection()) {
            String sql = "INSERT INTO product VALUES(null,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, product.getTitle());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getNum());
            int i = ps.executeUpdate();
            if (i > 0) {
                return "添加成功!<a href='/'>返回首页</a>";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "添加失败";
    }

    @RequestMapping("/select")
    @ResponseBody
    public String select(Product product) {
        ArrayList<Product> list = new ArrayList<>();
        try (Connection connection = DBUtil.getConnection()) {
            String sql = "SELECT id,title,price,num FROM product";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                double price = rs.getDouble(3);
                int num = rs.getInt(4);
                list.add(new Product(id, title, price, num));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String html="<table border='1'>";
        html+="<caption>商品列表</caption>";
        html+="<tr><th>id</<th><th>商品标题</<th><th>价格</<th><th>库存</<th><th>操作</<th></tr>";
        for (Product p:list
             ) {
            html+="<tr>";
            html+="<td>"+ p.getId()+"</td>";
            html+="<td>"+ p.getTitle()+"</td>";
            html+="<td>"+ p.getPrice()+"</td>";
            html+="<td>"+ p.getNum()+"</td>";
            html+="<td><a href='/delete?id="+p.getId()+"'>删除</a></td>";
            html+="<tr>";
        }
        html+="</table>";
        return html;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(int id) {
        try (Connection connection = DBUtil.getConnection()) {
            String sql = "delete from product where id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "删除成功<a href='/select'>返回列表</a>";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(Product product) {
        System.out.println("product = " + product);
        try (Connection connection = DBUtil.getConnection()) {
            String sql="update product set title=?,price=?,num=? where id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,product.getTitle());
            ps.setDouble(2,product.getPrice());
            ps.setInt(3,product.getNum());
            ps.setInt(4,product.getId());
            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return "修改成功<a href='/select'>返回列表</a>";
    }

}
