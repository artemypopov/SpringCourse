package ru.popov.springcourse;

import org.springframework.stereotype.Component;

@Component("rockBean")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "RockMusic";
    }
}
