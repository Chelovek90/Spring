package ru.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static  ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }


    public void myInitMethod() {
        System.out.println("Classical init");
    }
    public void myDestroyMethod() {
        System.out.println("Classical destroy");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
