package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BatteryTest {

    @Test
    public void whenThis30Another50ThenAnother80() {
        Battery charger = new Battery(30);
        Battery another = new Battery(50);
        charger.exchange(another);
        int expected = 80;
        assertThat(another.about()).isEqualTo("My charge: " + expected + "%");
    }

    @Test
    public void whenThis80Another20ThenThis0() {
        Battery charger = new Battery(80);
        Battery another = new Battery(20);
        charger.exchange(another);
        int expected = 0;
        assertThat(charger.about()).isEqualTo("My charge: " + expected + "%");
    }

    @Test
    public void whenThis51Another0ThenAnother95() {
        Battery charger = new Battery(95);
        Battery another = new Battery(0);
        charger.exchange(another);
        int expected = 95;
        assertThat(another.about()).isEqualTo("My charge: " + expected + "%");
    }
}