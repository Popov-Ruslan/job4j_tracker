package ru.job4j.polymorph;

public interface Transport {

    void ride();

    void passengers(int quantity);

    double refuel(double litres);
}
