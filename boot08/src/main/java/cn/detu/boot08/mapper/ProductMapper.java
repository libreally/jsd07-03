package cn.detu.boot08.mapper;

import cn.detu.boot08.entity.Product;


//此时不需要@Mapper注解 只写方法
public interface ProductMapper {

    void insert(Product product);
}
