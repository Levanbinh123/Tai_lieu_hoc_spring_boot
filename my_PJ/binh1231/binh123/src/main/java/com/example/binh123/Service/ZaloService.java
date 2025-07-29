package com.example.binh123.Service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ZaloService implements MesInterface{
    @Override
    public String sendMessage() {
        return "Zalo sending";
    }
}
