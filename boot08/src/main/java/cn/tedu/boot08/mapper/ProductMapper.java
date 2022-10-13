package cn.tedu.boot08.mapper;

import cn.tedu.boot08.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;
//使用了@MapperScan注解 可不用@Mapper
//@Repository这个注解是将接口的一个实现类交给spring管理。
@Repository
public interface ProductMapper {

    void insert(Product product);

    void deleteById(int id);

    void update(Product product);

    List<Product> select();
    Product selectById(int id);
    int count();
    //批量删除
    int deleteByIds1(List<Integer> ids);
    int deleteByIds2(Integer[] ids);
    int deleteByIds3(Integer... ids);

    //批量插入
    int insertProducts(List<Product> list);
    //动态插入
    int dynamicInsert(Product product);
    //动态修改
    void dynamicUpdate(Product product);

}
