package cn.tedu.boot07.controller;

import cn.tedu.boot07.entity.Weibo;
import cn.tedu.boot07.mapper.WeiboMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class WeiboController {
    @Autowired
    WeiboMapper mapper;

    @RequestMapping("/insert")
    public void insert(@RequestBody Weibo weibo) {
        System.out.println("weibo = " + weibo);
        weibo.setCreated(new Date());
        /*create table weibo(
            id  int auto_increment primary key,
            content varchar(100),
            url     varchar(200),
            created timestamp,
        );*/
        mapper.insert(weibo);
    }
}
