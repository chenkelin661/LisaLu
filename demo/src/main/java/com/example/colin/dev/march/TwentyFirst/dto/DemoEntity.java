package com.example.colin.dev.march.TwentyFirst.dto;

import lombok.Data;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.io.Serializable;

@Data
public class DemoEntity implements Serializable {
    private String id;
    private String userName;

    private String mobilePhone;
}
