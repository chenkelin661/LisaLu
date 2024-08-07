package com.example.colin.dev.march.TwentyFirst.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: mpw
 * @date: 2024/08/05 13:23
 **/
@Data
@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
@TableName("user_mybatis_plus")
public class User {
    private String id;
    private String name;
    private String age;
    private String email;
    private String mobilePhone;

}