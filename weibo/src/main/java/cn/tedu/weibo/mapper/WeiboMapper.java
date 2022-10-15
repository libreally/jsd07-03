package cn.tedu.weibo.mapper;


import cn.tedu.weibo.pojo.entity.Weibo;

import cn.tedu.weibo.pojo.vo.WeiboDetailVO;
import cn.tedu.weibo.pojo.vo.WeiboListVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeiboMapper {
        void insert(Weibo Weibo);
        List<WeiboListVO> select();
        WeiboDetailVO selectById(int id);

}
