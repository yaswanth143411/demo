package com.myapp.demo.Services.impl;

import com.myapp.demo.Model.Demo;
import com.myapp.demo.Repositories.DemoRepository;
import com.myapp.demo.Services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoRepository demoRepository;
    @Override
    public Demo save(Demo demo) {

        demo=demoRepository.save(demo);
        return demo;
    }
}
