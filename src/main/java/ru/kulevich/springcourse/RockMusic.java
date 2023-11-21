package ru.kulevich.springcourse;

import org.springframework.stereotype.Component;

@Component("rockMusicBean")
public class RockMusic implements Music {
    private RockMusic() {}

    public static RockMusic getInstance() {
        return new RockMusic();
    }

    private void initialization() {
        System.out.println("Initialization of RockMusic");
    }

    protected void destruction() {
        System.out.println("Destruction of RockMusic");
    }

    @Override
    public String getSong() {
        return "Wind Cries Mary";
    }
}
