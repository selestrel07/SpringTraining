package ru.kulevich.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic(MusicGenre.ROCK));
        System.out.println(musicPlayer.playMusic(MusicGenre.ROCK));
        System.out.println(musicPlayer.playMusic(MusicGenre.ROCK));
        System.out.println(musicPlayer.playMusic(MusicGenre.CLASSICAL));
        System.out.println(musicPlayer.playMusic(MusicGenre.CLASSICAL));
        System.out.println(musicPlayer.playMusic(MusicGenre.CLASSICAL));

        context.close();
    }
}
