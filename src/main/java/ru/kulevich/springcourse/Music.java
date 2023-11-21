package ru.kulevich.springcourse;

import java.util.List;

public interface Music {

    String getSong();

    default List<String> getSongs() {
        return null;
    }
}
