package ru.spring;

import org.springframework.stereotype.Component;

import javax.annotation.*;

@Component("rockMusic")
public class RockMusic implements Music {

    @PostConstruct
    public void myInitMethod() {
        System.out.println("Rock init");
    }
    @PreDestroy
    public void myDestroyMethod() {
        System.out.println("Rock destroy");
    }
    @Override
    public String getSong() {
        return "Highway to well";
    }
}
