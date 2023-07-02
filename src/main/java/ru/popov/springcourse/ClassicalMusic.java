package ru.popov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component("classicalBean")
//@Scope("singleton")
@Scope("prototype")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

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
