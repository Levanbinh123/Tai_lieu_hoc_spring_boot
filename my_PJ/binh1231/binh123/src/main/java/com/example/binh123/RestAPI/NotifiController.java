package com.example.binh123;

import com.example.binh123.Service.MesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotifiController {
    private MesInterface email;
   @Autowired
   public NotifiController(MesInterface email) {
       this.email=email;
   }
    @GetMapping("/send-email")
    public String sendEmail() {
        return this.email.sendMessage();
    }
}
