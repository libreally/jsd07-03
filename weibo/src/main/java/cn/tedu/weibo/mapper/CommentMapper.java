package cn.tedu.weibo.mapper;


import cn.tedu.weibo.pojo.entity.Comment;
import cn.tedu.weibo.pojo.vo.CommentVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {
    void insert(Comment comment);

    List<CommentVO> selectByWeiboId(int id);
}
