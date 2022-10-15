package cn.tedu.weibo.controller;

import cn.tedu.weibo.mapper.CommentMapper;
import cn.tedu.weibo.pojo.dto.CommentDTO;
import cn.tedu.weibo.pojo.entity.Comment;
import cn.tedu.weibo.pojo.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class CommentController {
    @Autowired
    CommentMapper mapper;
    @RequestMapping("/comment/insert")
    public int insert(@RequestBody CommentDTO comment, HttpSession session){
        UserVO user = (UserVO) session.getAttribute("user");
        if (user==null){
            return 2;
        }
        System.out.println("comment = " + comment);
        Comment c = new Comment();
        BeanUtils.copyProperties(comment,c);
        //设置用户id
        c.setUserId(user.getId());
        mapper.insert(c);
        return 1;
    }
}
