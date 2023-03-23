package ru.job4j.oop;

public class Story {

    public static void main(String[] args) {
        Girl girl = new Girl();
        Pioneer petya = new Pioneer();
        Wolf wolf = new Wolf();
        girl.call(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
