package ru.job4j.polymorph;

public class Main {
    public static void main(String[] args) {
        Vehicle sportCar = new SportCar();
        sportCar.accelerate();
        sportCar.brake();
        sportCar.steer();
        sportCar.changeGear();
        sportCar.refill();
    }
}
