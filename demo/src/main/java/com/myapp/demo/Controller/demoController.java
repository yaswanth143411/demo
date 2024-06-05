package com.myapp.demo.Controller;

import com.myapp.demo.Model.Demo;
import com.myapp.demo.Services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class demoController {

    @Autowired
    private DemoService  demoService;

    public  demoController(DemoService demoService){
        this.demoService=demoService;

    }
    @PostMapping("/create")
    public ResponseEntity<Demo> create(Demo demo){
        try {
            demo = demoService.save(demo);
            if(demo!=null){
                return ResponseEntity.ok().body(demo);
            }
            return ResponseEntity.internalServerError().body(null);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(null);
        }
    }
}
