package cn.detu.boot08.mapper;

import cn.detu.boot08.entity.Product;
import org.springframework.stereotype.Repository;


//此时不需要@Mapper注解
public interface ProductMapper {

    void insert(Product product);
}
