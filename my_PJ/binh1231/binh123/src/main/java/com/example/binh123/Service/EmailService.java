package com.example.binh123;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MesInterface {
    @Override
    public String sendMessage() {
        return "email sending";
    }
}
