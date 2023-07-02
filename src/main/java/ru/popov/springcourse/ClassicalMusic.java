package ru.popov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("classicalBean")
public class ClassicalMusic implements Music {
    private List<String> listClassicalMusic = new ArrayList<>();
    {
        listClassicalMusic.add("ClassicalMusic1");
        listClassicalMusic.add("ClassicalMusic2");
        listClassicalMusic.add("ClassicalMusic3");
    }

    @Override
    public List<String> getSong() {
        return listClassicalMusic;
    }

//    @Override
//    public void getSong() {
//        return "ClassicalMusic";
//    }
}
