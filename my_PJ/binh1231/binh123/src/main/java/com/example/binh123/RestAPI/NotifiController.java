package com.example.binh123.RestAPI;

import com.example.binh123.Service.MesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotifiController {
    private MesInterface service;

    @Autowired
    public NotifiController( MesInterface service) {
        this.service = service;
    }


    @GetMapping("/send-email")
    public String sendEmail() {
        return this.service.sendMessage();
    }

}
