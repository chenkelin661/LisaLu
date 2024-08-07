package com.example.colin.dev.march.TwentyFirst.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.colin.dev.march.TwentyFirst.dto.DemoEntity;
import com.example.colin.dev.march.TwentyFirst.dto.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DemoMapper {
    List<DemoEntity> getFirstTest(DemoEntity demoEntity);


}
