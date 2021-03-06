package net.sunmonkey;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.sunmonkey.dao.mapper")
public class SpringbootMybatisDemoApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
    }
}
