package com.jmu.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jmu.server.mapper")
public class OfficeApplication {

    public static void main(String[] args) {
        SpringApplication.run(OfficeApplication.class,args);
    }
}
