package ru.amina.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    ClassicalMusic classicalMusic;
    RockMusic rockMusic;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic){
    this.classicalMusic = classicalMusic;
    this.rockMusic = rockMusic;
    }

    public void playMusic(Muzictype music) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if(music == Muzictype.ROCK){
            System.out.println(rockMusic.getSong());
        } else
        { System.out.println(classicalMusic.getSong());}

    }
}
