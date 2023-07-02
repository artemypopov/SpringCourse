package ru.popov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
//    @Autowired
//    @Qualifier("classicalBean")
    private Music musicClassic;
    private Music musicRock;

    public MusicPlayer(@Qualifier("classicalBean") Music musicClassic,
                       @Qualifier("rockBean") Music musicRock) {
        this.musicClassic = musicClassic;
        this.musicRock = musicRock;
    }

    public void playMusic(MusicalGenre musicalGenre) {
        int musicRandom = new Random().nextInt(3);

        if (musicalGenre == MusicalGenre.CLASSICAL) {
            System.out.println(musicClassic.getSong().get(musicRandom));
        } else {
            System.out.println(musicRock.getSong().get(musicRandom));
        }
    }

//    public String playMusic() {
//        return "Playing " + musicClassic.getSong() + ", " + musicRock.getSong();
//    }
}