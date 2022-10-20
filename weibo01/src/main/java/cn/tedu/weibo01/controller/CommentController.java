package cn.tedu.weibo01.controller;

import cn.tedu.weibo01.mapper.CommentMapper;
import cn.tedu.weibo01.pojo.dto.CommentDTO;
import cn.tedu.weibo01.pojo.entity.Comment;
import cn.tedu.weibo01.pojo.vo.CommentListVO;
import cn.tedu.weibo01.pojo.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentMapper mapper;

    @RequestMapping("/comment/insert")
    public int insert(@RequestBody CommentDTO comment, HttpSession session,Integer id){
        UserVO user = (UserVO) session.getAttribute("user");
        if (user==null) {
            return 2;
        }
        Comment c = new Comment();
        BeanUtils.copyProperties(comment,c);
        c.setUserId(user.getId());
        c.setWeiboId(id);
        mapper.insert(c);
        return 1;
    }
    @RequestMapping("/comment/selectById")
    public List<CommentListVO> selectById(int id){
        return mapper.selectById(id);
    }
}
