package cn.tedu.boot08.mapper;

import cn.tedu.boot08.entity.MyProduct;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MyProductMapper {
    void insert(MyProduct product);
    MyProduct selectById(int id);
    List<MyProduct> select();
}
