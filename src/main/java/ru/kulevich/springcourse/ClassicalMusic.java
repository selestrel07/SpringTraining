package ru.kulevich.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public List<String> getSongs() {
        return List.of("Hungarian Rhapsody", "Carmen", "O mio babbino caro");
    }
}
