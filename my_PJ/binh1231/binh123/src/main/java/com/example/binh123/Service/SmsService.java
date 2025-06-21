package com.example.binh123;

import org.springframework.stereotype.Component;

public class SmsService implements MesInterface {
    @Override
    public String sendMessage() {
        return "Sms sending";
    }
}
