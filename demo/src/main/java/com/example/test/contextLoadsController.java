package com.example.test;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.colin.dev.march.TwentyFirst.dto.User;
import com.example.colin.dev.march.TwentyFirst.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: mpw
 * @date: 2024/08/05 13:29
 **/
@SpringBootApplication
@Slf4j
@MapperScan("com.example.colin.dev.march.TwentyFirst.mapper")
public class contextLoadsController {

    //继承了BaseMapper ,所有方法来自父类，可扩展

    @Resource
    private UserMapper userMapper;

    @Test
  public   void contextLoads() {
        System.out.println(("----- selectAll method test 测试查询所有用户方法 ------"));
        //selectList 的参数wrapper 是条件构造器，可以先写null
        User user = new User();
        user.setAge("1");
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getName, "1");
// 上述代码表示查询名为“张三”的用户，其中 `User::getName` 是基于 Java 8 的方法引用。
        List<User> userList = userMapper.selectList(wrapper);
        //forEach 的参数是 Consumer类型的 语法糖
        userList.forEach(System.out::println);
    }

}