package com.example.binh123.RestAPI;

import com.example.binh123.Service.MesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Notifi2Controller {
    private MesInterface sms;
    private MesInterface email;
    private MesInterface zalo;
    @Autowired
    public Notifi2Controller(
            @Qualifier("zaloService") MesInterface zalo,
            @Qualifier("smsService") MesInterface sms,
            @Qualifier("emailService") MesInterface email) {
        this.zalo = zalo;
        this.sms = sms;
        this.email = email;
    }
    @GetMapping("/zalo")
    public String sendZalo() {
        return this.zalo.sendMessage();
    }
    @GetMapping("/sms")
    public String sendSms() {
        return this.sms.sendMessage();
    }
    @GetMapping("/email")
    public String sendEmail() {
        return this.email.sendMessage();
    }
}
