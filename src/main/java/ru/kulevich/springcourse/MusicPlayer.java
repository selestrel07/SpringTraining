package ru.kulevich.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private String volume;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
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
