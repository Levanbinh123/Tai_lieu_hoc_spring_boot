package com.example.binh123;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMath {
    private Calculator calculator ;
    @Autowired
    public TestMath(@Qualifier("getCalculator") Calculator calculator) {
        this.calculator = calculator;
    }
    @GetMapping("/add" )
    public String add(@RequestParam("value1") double  b){
return " "+calculator.add(b);
    }
}
