package ru.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayerFirst = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayerSecond = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comprasion = musicPlayerFirst == musicPlayerSecond;

        System.out.println(comprasion);

        System.out.println(musicPlayerSecond.getVolume());
        musicPlayerFirst.setVolume(10);

        System.out.println(musicPlayerFirst);
        System.out.println(musicPlayerSecond);

        System.out.println(musicPlayerFirst.getVolume());
        System.out.println(musicPlayerSecond.getVolume());

        context.close();

    }
}
