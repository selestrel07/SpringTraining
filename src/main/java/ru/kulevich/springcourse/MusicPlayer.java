package ru.kulevich.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playMusic(MusicGenre genre) {
        int songIndex = new Random().nextInt(3);
        return "Playing:" + switch(genre) {
            case ROCK -> rockMusic.getSongs().get(songIndex);
            case CLASSICAL -> classicalMusic.getSongs().get(songIndex);
            default -> null;
        };
    }
}
