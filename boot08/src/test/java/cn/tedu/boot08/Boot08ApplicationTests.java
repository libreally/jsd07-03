package cn.tedu.boot08;

import cn.tedu.boot08.entity.Product;
import cn.tedu.boot08.mapper.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;


@SpringBootTest
class Boot08ApplicationTests {

    @Autowired
    ProductMapper mapper;
    @Test
    void contextLoads() {
        Product p = new Product();
        p.setTitle("小米养生壶");
        p.setPrice(159.0);
        p.setNum(222);
        mapper.insert(p);
    }

    @Test
    void t1(){
        mapper.deleteById(1);
    }
    @Test
    void t2(){
        Product p = new Product();
        p.setId(6);
        p.setTitle("麦当劳");
        p.setPrice(10.0);
        p.setNum(50);
        mapper.update(p);
    }
    @Test
    void t3(){
        System.out.println(mapper.selectById(6));
        System.out.println(mapper.select());
    }
    @Test
    void t4(){
        System.out.println(mapper.count());
    }

    @Test
    void t5(){
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(6);
//        System.out.println(mapper.deleteByIds1(list));


//        Integer[] ids = {7,8};
//        System.out.println(mapper.deleteByIds2(ids));
        System.out.println(mapper.deleteByIds3(9,10));
    }
    @Test
    void t6(){
        Product p1 = new Product(null,"a",1.0,1);
        Product p2 = new Product(null,"b",2.0,2);
        Product p3 = new Product(null,"c",3.0,3);
        ArrayList<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println(mapper.insertProducts(list));
    }
    @Test
    void t7(){
        Product p = new Product();
        p.setTitle("华为手机");
        mapper.dynamicInsert(p);
    }
    @Test
    void t8(){
        Product p = new Product();
        p.setId(4);
        p.setPrice(100.00);
        mapper.dynamicUpdate(p);
    }
}
