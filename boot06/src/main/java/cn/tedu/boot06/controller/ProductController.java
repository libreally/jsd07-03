package cn.tedu.boot06.controller;

import cn.tedu.boot06.entity.Product;
import cn.tedu.boot06.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductMapper mapper;

    /**
     * 添加商品
     */
    @RequestMapping("/insert")
    public void insert(@RequestBody Product product){
        System.out.println("product = " + product);
        mapper.insert(product);
    }
    @RequestMapping("/select")
    public List<Product> select(){
        return mapper.select();
    }
    @RequestMapping("/delete")
    public void delete(int id){
       mapper.deleteById(id);
    }

    @RequestMapping("/selectById")
    public Product selectById(int id){
        return mapper.selectById(id);
    }

    @RequestMapping("/update")
    public void update(@RequestBody Product product){
        mapper.update(product);
    }

}
