package com.example.colin;

import com.example.colin.dev.march.TwentyFirst.dto.User;
import com.example.colin.dev.march.TwentyFirst.mapper.UserMapper;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

@EnableScheduling
@SpringBootApplication


public class DemoApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }




}