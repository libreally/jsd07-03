package cn.tedu.boot06.mapper;

import cn.tedu.boot06.entity.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {
    //增
    @Insert("insert into product values (null,#{title},#{price},#{num})")
    void insert(Product product);

    //删
    @Delete("delete from product where id=#{id}")
    void deleteById(int id);

    // 查
    @Select("SELECT id,title,price,num FROM product")
    List<Product> select();

    // 改
    @Update("update product set title=#{title},price=#{price},num=#{num} where id=#{id}")
    void update(Product product);

    @Select("select id,title,price,num from product where id=#{id}")
    Product selectById(int id);
}
