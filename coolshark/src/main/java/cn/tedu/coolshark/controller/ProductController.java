package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.mapper.ProductMapper;
import cn.tedu.coolshark.pojo.dto.ProductDTO;
import cn.tedu.coolshark.pojo.dto.ProductUpdateDTO;
import cn.tedu.coolshark.pojo.entity.Product;
import cn.tedu.coolshark.pojo.vo.ProductAdminVO;
import cn.tedu.coolshark.pojo.vo.ProductUpdateVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Date;
import java.util.List;

@RestController
public class ProductController {
    @Autowired(required = false)
    ProductMapper mapper;

    @RequestMapping("/product/insert")
    public void insert(@RequestBody ProductDTO product){
        System.out.println("product = " + product);
        Product p = new Product();
        BeanUtils.copyProperties(product,p);
        p.setCreated(new Date());
        p.setViewCount(0);
        mapper.insert(p);
    }
    @RequestMapping("/product/select/admin")
    public List<ProductAdminVO> select(){
        return mapper.select();
    }
    @RequestMapping("/product/delete")
    public void delete(int id){
        //删文件
        String url=mapper.selectUrlById(id);
        new File("d:/files"+url).delete();
        //删DB数据
        mapper.deleteById(id);
    }
    @RequestMapping("/product/selectById/update")
    public ProductUpdateVO selectByIdUpdate(int id){
       return mapper.selectByIdUpdate(id);
    }
    @RequestMapping("/product/update")
    public void update(@RequestBody ProductUpdateDTO product){
        System.out.println("product = " + product);

        mapper.update(product);
    }
}
