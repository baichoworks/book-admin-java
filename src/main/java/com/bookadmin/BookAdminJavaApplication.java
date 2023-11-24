package com.bookadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bookadmin.mapper")
public class BookAdminJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookAdminJavaApplication.class, args);
    }

}
