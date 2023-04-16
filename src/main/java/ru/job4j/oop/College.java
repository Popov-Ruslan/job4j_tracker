package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student sFreshman = freshman;
        Object oFreshman = freshman;
        Student student =  new Freshman();
        Freshman f = (Freshman) student;
            f.music();
            f.singSong();
            ((Freshman) student).singSong();
    }
}
