package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.mapper.ProductMapper;
import cn.tedu.coolshark.pojo.dto.ProductDTO;
import cn.tedu.coolshark.pojo.dto.ProductUpdateDTO;
import cn.tedu.coolshark.pojo.entity.Product;
import cn.tedu.coolshark.pojo.vo.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Date;
import java.util.List;

@RestController
public class ProductController {
    @Value("${dirPath}")
    private String dirPath;
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
        new File(dirPath+url).delete();
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
    @RequestMapping("/product/select/top")
    public List<ProductTopVO> selectTop(){
        return mapper.selectTop();
    }
    @RequestMapping("/product/select/index")
    public List<ProductIndexVO> selectIndex(){
        return mapper.selectIndex();
    }
    @RequestMapping("/product/selectById/detail")
    public ProductDetailVO selectByIdDetail(int id, HttpSession session){
        String info = (String) session.getAttribute("view" + id);
        if (info==null){
            //浏览量增加
            mapper.updateViewCount(id);
            session.setAttribute("view"+id,"isVisited");
        }
        return mapper.selectByIdDetail(id);
    }
    @RequestMapping("/product/selectByCid")
    public List<ProductIndexVO> selectByCid(int id){
        return mapper.selectByCid(id);
    }
    @RequestMapping("/product/selectByWd")
    public List<ProductIndexVO>selectByWd(String wd){
        return mapper.selectByWd(wd);
    }
}
