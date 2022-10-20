package cn.tedu.boot04.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BMIController {

    @RequestMapping("/bmi")
    public String bmi(double h,double w){
        double bmi= w/(h*h);
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
