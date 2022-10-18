package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.mapper.BannerMapper;
import cn.tedu.coolshark.pojo.entity.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;

@RestController
//@RequestMapping("/banner/select")
public class BannerController {
    @Autowired(required = false)
    BannerMapper mapper;

    @RequestMapping("/banner/select")
    public List<Banner> select() {
        return mapper.select();
    }

    @RequestMapping("/banner/delete")
    public void delete(int id) {
        String url=mapper.selectUrlById(id);
        new File("d:/files"+url).delete();
        mapper.deleteById(id);
    }
    @RequestMapping("/banner/insert")
    public void insert(String url){
        mapper.insert(url);
    }
    @RequestMapping("/banner/update")
    public void update(@RequestBody Banner banner){
        System.out.println("banner = " + banner);
        mapper.update(banner);
    }

}
