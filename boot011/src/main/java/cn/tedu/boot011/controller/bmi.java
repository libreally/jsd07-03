package cn.tedu.boot011.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class bmi {
    @RequestMapping("/bmi")
    @ResponseBody
    public String bmi(double height,double weight){
         double bmi= weight/(height*height);
         if (bmi<18.5){
             return "bmi指数"+bmi+ " 偏瘦";
         }else if (bmi>18.5&&bmi<24){
             return "bmi指数"+bmi+ " 正常";
         }else if (bmi>24&&bmi<28){
             return "bmi指数"+bmi+ " 微胖";
         }else{
             return "bmi指数"+bmi+ " 胖了";
         }
    }
}
