package ru.popov.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    private static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization ClassicalMusic");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction ClassicalMusic");
    }
    @Override
    public String getSong() {
        return "ClassicalMusic";
    }
}
