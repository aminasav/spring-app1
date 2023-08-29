package ru.amina.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "aplicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
       musicPlayer.playMusic(Muzictype.ROCK);

        context.close();
    }
}
