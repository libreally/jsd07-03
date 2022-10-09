package cn.tedu.boot03.mapper;

import cn.tedu.boot03.entity.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {
    //咋mapper接口中书写实体类和DB中表之间的对应关系
    //mybatis会根据此关系生成jdbc代码
    @Insert("INSERT INTO product VALUES(NULL,#{title},#{price},#{num})")
    void insert(Product product);
    //查询到的数据装进集合并把集合作为返回值
    @Select("SELECT id,title,price,num FROM product")
    List<Product> select();
    //删除功能
    @Delete("DELETE FROM product WHERE id=#{id}")
    void deleteById(int id);
    //更新
    @Update("update product set title=#{title},price=#{price},num=#{num} where id=#{id}")
    void update(Product product);
}
