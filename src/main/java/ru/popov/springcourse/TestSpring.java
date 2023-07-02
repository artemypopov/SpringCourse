package ru.popov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicalGenre.CLASSICAL);
        musicPlayer.playMusic(MusicalGenre.ROCK);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalBean", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("classicalBean", ClassicalMusic.class);

//        System.out.println(classicalMusic1 == classicalMusic2);


        context.close();

    }
}
