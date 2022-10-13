package cn.tedu.boot09.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.tedu.boot09.mapper")
public class EmpConfig {
}
