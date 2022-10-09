package cn.tedu.boot03.controller;

import cn.tedu.boot03.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//使用@RestController相当于在每一个方法上添加了@ResponseBody注解
@RestController
public class ProductController {
    @RequestMapping("/insert")
    public String insert(Product product){
        System.out.println("product = " + product);



        return "添加完成<a href='/'>返回首页</a>";
    }

}
