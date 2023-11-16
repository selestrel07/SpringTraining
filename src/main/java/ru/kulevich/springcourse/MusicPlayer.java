package ru.kulevich.springcourse;

import java.util.List;

public class MusicPlayer {

    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public void playMusic() {
        musicList.forEach(c -> System.out.println("Playing: " + c.getSong()));
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
