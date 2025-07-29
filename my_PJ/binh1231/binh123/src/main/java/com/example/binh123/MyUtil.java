package com.example.binh123;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.lang.Math;
@Configuration
public class MyUtil {
@Bean
    public Calculator getCalculator() {
        return new Calculator();
    }
}
