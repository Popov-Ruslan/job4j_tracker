package ru.job4j.polymorph;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println("Вошло " + quantity + " пассажиров");
    }

    @Override
    public double refuel(double litres) {
        return 0;
    }
}
