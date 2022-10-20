package cn.tedu.coolshark.mapper;

import cn.tedu.coolshark.pojo.entity.Banner;

import java.util.List;


public interface BannerMapper {
    List<Banner> select();
    void deleteById(int id);

    void insert(String url);

    void update(Banner banner);

    String selectUrlById(int id);
}
