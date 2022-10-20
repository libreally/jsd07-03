package cn.tedu.weibo01.controller;


import cn.tedu.weibo01.mapper.WeiboMapper;
import cn.tedu.weibo01.pojo.dto.WeiboDTO;
import cn.tedu.weibo01.pojo.entity.Weibo;
import cn.tedu.weibo01.pojo.vo.UserVO;
import cn.tedu.weibo01.pojo.vo.WeiboDetailVO;
import cn.tedu.weibo01.pojo.vo.WeiboListVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
public class WeiboController {
    @Autowired(required = false)
    WeiboMapper mapper;

    @RequestMapping("/weibo/insert")
    public int insert(@RequestBody WeiboDTO weibo, HttpSession session){
        //判断是否登陆
        UserVO user = (UserVO) session.getAttribute("user");
        if (user==null){
            return 2;
        }
        System.out.println("weibo = " + weibo);
        //创建微博实体类，并且把DTO的内容装进实体类
        Weibo w = new Weibo();
        BeanUtils.copyProperties(weibo,w);
        System.out.println(w);
        //设置时间
        w.setCreated(new Date());
        //设置当前登陆用户id
        w.setUserId(user.getId());
        mapper.insert(w);
        return 1;
    }
    @RequestMapping("/weibo/select")
    public List<WeiboListVO> select(){
        return mapper.select();
    }
    @RequestMapping("/weibo/selectById")
    public WeiboDetailVO selectById(int id){
        return mapper.selectById(id);
    }

}
