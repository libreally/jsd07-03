package cn.tedu.boot04.controller;

import cn.tedu.boot04.entity.Product;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AxiosController {
    @RequestMapping("/getAxios")
    public String getAxios(String name,int age){
        return "测试成功,name="+name+" age="+age;
    }
    /*如果为post请求并且传递来的是自定义JS对象接收到的参数时要
    * 添加@RequsetBody注解，要是不添加，则全部为null*/
    @RequestMapping("postAxios")
    public String PostAxios(@RequestBody Product product){
        return "测试成功"+product;
    }

}
