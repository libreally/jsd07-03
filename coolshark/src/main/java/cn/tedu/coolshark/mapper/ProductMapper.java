package cn.tedu.coolshark.mapper;

import cn.tedu.coolshark.pojo.dto.ProductUpdateDTO;
import cn.tedu.coolshark.pojo.entity.Product;
import cn.tedu.coolshark.pojo.vo.ProductAdminVO;
import cn.tedu.coolshark.pojo.vo.ProductUpdateVO;

import java.util.List;

public interface ProductMapper {
    String selectUrlById(int id);

    void insert(Product product);

    List<ProductAdminVO> select();

    void deleteById(int id);

    ProductUpdateVO selectByIdUpdate(int id);

    void update(ProductUpdateDTO p);
}
