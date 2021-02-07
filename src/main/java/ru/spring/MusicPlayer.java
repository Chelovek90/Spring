package ru.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private Music music;

    private String name;
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println(music.getSong());

    }

}
