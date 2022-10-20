package cn.tedu.weibo01.mapper;

import cn.tedu.weibo01.pojo.entity.Weibo;
import cn.tedu.weibo01.pojo.vo.WeiboDetailVO;
import cn.tedu.weibo01.pojo.vo.WeiboListVO;

import java.util.List;

public interface WeiboMapper {
    void insert(Weibo Weibo);
    List<WeiboListVO> select();
    WeiboDetailVO selectById(int id);
}
