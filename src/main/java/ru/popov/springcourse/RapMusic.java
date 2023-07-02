package ru.popov.springcourse;

public class RapMusic implements Music {

    public void doMyInit() {
        System.out.println("Doing my initialization RapMusic");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction RapMusic");
    }

    @Override
    public String getSong() {
        return "RapMusic";
    }
}
