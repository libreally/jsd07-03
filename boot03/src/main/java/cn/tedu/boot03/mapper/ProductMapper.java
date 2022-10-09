package cn.tedu.boot03.mapper;

import cn.tedu.boot03.entity.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    //咋mapper接口中书写实体类和DB中表之间的对应关系
    //mybatis会根据此关系生成jdbc代码
    @Insert("INSERT INTO product VALUES(NULL,#{title},#{price},#{num})")
    void insert(Product product);

}
