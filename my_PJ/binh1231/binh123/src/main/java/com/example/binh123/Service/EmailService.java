package com.example.binh123.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class EmailService implements MesInterface {
    @PostConstruct
    public void init() {
        System.out.println("EmailService init..."+getClass().getName());
    }
    @PreDestroy
    public void destroy() {
        System.out.println("EmailService destroy.."+getClass().getName());
    }
    @Override
    public String sendMessage() {
        return "email sending";
    }
}
