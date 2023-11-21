package ru.kulevich.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music rockMusic = context.getBean("rockMusicBean", Music.class);

        Music classicalMusic = context.getBean("classicalMusicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(List.of(rockMusic, classicalMusic));

        musicPlayer.playMusic();

        context.close();
    }
}
