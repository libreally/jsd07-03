package cn.tedu.boot07.controller;

import cn.tedu.boot07.entity.Weibo;
import cn.tedu.boot07.mapper.WeiboMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Date;
import java.util.List;

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
    @RequestMapping("/select")
    public List<Weibo> select(){
        return mapper.select();
    }
    @RequestMapping("/delete")
    public void delete(int id){
        String url=mapper.deleteUrlById(id);
        //删除指定位置的文件
        new File("d:/files"+url).delete();
        mapper.deleteById(id);
    }

}
