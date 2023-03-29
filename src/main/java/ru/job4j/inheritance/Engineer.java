package ru.job4j.inheritance;

public class Engineer extends Profession {
    public int experience;

    public Engineer(int experience, boolean degree) {
        super(degree);
        this.experience = experience;
    }
}
