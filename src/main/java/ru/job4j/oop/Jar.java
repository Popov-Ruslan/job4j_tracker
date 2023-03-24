package ru.job4j.oop;

public class Jar {

    private int water;

    public Jar(int water) {
        this.water = water;
    }

    public void pour(Jar another) {
        water = water + another.water;
        another.water = 0;
    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.printf("Jar 1: %d. Jar 2: %d%n", first.water, second.water);
        first.pour(second);
        System.out.printf("Jar 1: %d. Jar 2: %d%n", first.water, second.water);

    }
}
