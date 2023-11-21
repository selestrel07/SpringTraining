package ru.kulevich.springcourse;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {

    @Override
    public String getSong() {
        return "Oops! I did it again!";
    }
}
