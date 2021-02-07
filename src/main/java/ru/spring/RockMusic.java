package ru.spring;

public class RockMusic implements Music {
    public void myInitMethod() {
        System.out.println("Rock init");
    }
    public void myDestroyMethod() {
        System.out.println("Rock destroy");
    }
    @Override
    public String getSong() {
        return "Highway to well";
    }
}
