package ru.popov.springcourse;

import org.springframework.stereotype.Component;

@Component("classicalBean")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "ClassicalMusic";
    }
}
