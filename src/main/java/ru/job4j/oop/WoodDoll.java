package ru.job4j.oop;

public class WoodDoll {

    String name;
    WoodDoll child;

    public WoodDoll(String name, WoodDoll child) {
        this.name = name;
        this.child = child;
    }

    public void greet() {
        System.out.printf("Hello, my name is %s.%n", name);
        if (child != null) {
            System.out.printf("I have a child, her name is %s. Let's call her%n", child.name);
            child.greet();
        } else {
            System.out.println("I don't have children");
        }
    }

    public static void main(String[] args) {
        WoodDoll little = new WoodDoll("Little", null);
        WoodDoll middle = new WoodDoll("Middle", little);
        WoodDoll big = new WoodDoll("Big", middle);
        big.greet();
    }
}
