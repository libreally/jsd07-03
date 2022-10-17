package cn.tedu.coolshark.mapper;

import cn.tedu.coolshark.pojo.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CategoryMapper {
    List<Category> select();
    void deleteById(int id);

    void insert(String name);

    void update(Category category);
}
