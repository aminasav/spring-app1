package ru.amina.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {songs.add("1");songs.add("2"); songs.add("3");}

    @Override
    public List<String> getSong() {
        return songs;
    }
}
