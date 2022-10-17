package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.mapper.BannerMapper;
import cn.tedu.coolshark.pojo.entity.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        mapper.deleteById(id);
    }
}
