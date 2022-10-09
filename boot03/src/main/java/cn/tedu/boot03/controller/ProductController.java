package cn.tedu.boot03.controller;

import cn.tedu.boot03.entity.Product;
import cn.tedu.boot03.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//使用@RestController相当于在每一个方法上添加了@ResponseBody注解
@RestController
public class ProductController {
    /*自动装配 此框架添加之后,Mybatis和Spring框架会生成
    ProductMapper的实现类,并且实例化该实现类(实现类里面会实现ProductMapper中的
    抽象方法,实现的方法里面写的就是JDBC代码),并且把实例化好的对象赋值给了mapper变量*/
    @Autowired
    ProductMapper mapper;

    /**
     * 插入
     * @param product
     * @return
     */
    @RequestMapping("/insert")
    public String insert(Product product) {
        System.out.println("product = " + product);
        mapper.insert(product);
        return "添加完成<a href='/'>返回首页</a>";
    }

    /**
     * 查询
     * @return
     */
    @RequestMapping("/select")
    public String select() {
        List<Product> list = mapper.select();
        String html = "<table border='1'>";
        html += "<caption>商品列表</caption>";
        html += "<tr><th>id</<th><th>商品标题</<th><th>价格</<th><th>库存</<th><th>操作</<th></tr>";
        for (Product p : list) {
            html += "<tr>";
            html += "<td>" + p.getId() + "</td>";
            html += "<td>" + p.getTitle() + "</td>";
            html += "<td>" + p.getPrice() + "</td>";
            html += "<td>" + p.getNum() + "</td>";
            html += "<td><a href='/delete?id=" + p.getId() + "'>删除</a></td>";
            html += "</tr>";
        }
        html += "</table>";
        return html;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public String deleteById(int id) {
        mapper.deleteById(id);
        return "添加完成<a href='/select'>返回列表</a>";
    }
    /**
     * 更新
     */
    @RequestMapping("/update")
    public String update(Product product) {
        mapper.update(product);
        return "修改完成<a href='/select'>返回列表</a>";
    }

}
