package cn.tedu.boot09;

import cn.tedu.boot09.entity.Emp;
import cn.tedu.boot09.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Boot09ApplicationTests {

    @Autowired
    EmpMapper mapper;
    @Test
    void contextLoads() {
    }
    @Test
    void test1(){
        Emp e = new Emp();
        e.setName("张三");
        e.setSalary(123);
        e.setJob("程序员");
        e.setManagerId(2);
        mapper.insert(e);
    }
    @Test
    void test2(){
        Emp emp1 = new Emp(null, "李四", 2355, "工程师", 4);
        Emp emp2 = new Emp(null, "王五", 2355, "工程师", 4);
        Emp emp3 = new Emp(null, "张三三", 2355, "工程师", 4);
        List<Emp> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);
        mapper.insertEmps(list);
    }
    @Test
    void test3(){
        mapper.deleteById(3);
    }
    @Test
    void test4(){
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(5);
        System.out.println(mapper.deleteByIds(list));
    }
    @Test
    void test5(){
        Emp e=new Emp();
        e.setId(7);
        e.setName("如果");
        mapper.dynamicUpdate(e);
    }
    @Test
    void test6(){
        System.out.println(mapper.select());
    }
    @Test
    void test7(){
        System.out.println(mapper.selectById(1));
    }
    @Test
    void test8(){
        System.out.println(mapper.count());
    }


}
