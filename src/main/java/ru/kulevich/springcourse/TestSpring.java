package ru.kulevich.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println("Name: " + musicPlayer.getName());
        System.out.println("Volume: " + musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusicBean", ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2);

        context.close();
    }
}
