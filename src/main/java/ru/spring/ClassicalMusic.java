package ru.spring;

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
