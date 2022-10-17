package cn.tedu.weibo01.mapper;


import cn.tedu.weibo01.pojo.entity.Comment;
import cn.tedu.weibo01.pojo.vo.CommentListVO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentMapper  {
    void insert(Comment comment);
    List<CommentListVO> selectById(int id);
}
