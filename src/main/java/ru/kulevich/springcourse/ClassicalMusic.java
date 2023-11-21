package ru.kulevich.springcourse;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destructing");
    }
}
