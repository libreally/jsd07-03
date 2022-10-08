package cn.tedu.boot011.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class hello {
    /*@RequestMapping("/hello")
    public void reg(HttpServletResponse response){
        //设置响应头
        response.setContentType("text/html;charset=utf-8");
        //获取输出对象
        try (PrintWriter pw = response.getWriter()){
            //输出数据
            pw.println("服务器响应");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/
    @RequestMapping("/hello")
    @ResponseBody       //在方法中可以通过返回值的方式给客户端响应数据
    public String hello(){
        return "服务器收到响应2222";
    }
}
