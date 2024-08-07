package com.example.colin.dev.march.TwentyFirst.service.impl;

import com.example.colin.dev.march.TwentyFirst.dto.DemoEntity;
import com.example.colin.dev.march.TwentyFirst.mapper.DemoMapper;
import com.example.colin.dev.march.TwentyFirst.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMapper demoMapper;

    @Override
    public List<DemoEntity> getFirstTest(DemoEntity demoEntity) {
        return demoMapper.getFirstTest(demoEntity);
    }
}
