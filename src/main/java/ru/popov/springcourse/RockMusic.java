package ru.popov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rockBean")
public class RockMusic implements Music {

    private List<String> listRockMusic = new ArrayList<>();
    {
        listRockMusic.add("RockMusic1");
        listRockMusic.add("RockMusic2");
        listRockMusic.add("RockMusic3");
    }
    @Override
    public List<String> getSong() {
        return listRockMusic;
    }

//    @Override
//    public void getSong() {
//        return "RockMusic";
//    }

}
