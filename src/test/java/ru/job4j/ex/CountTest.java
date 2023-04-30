package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CountTest {
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Count.add(10, 3);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("Start should be less than finish");
    }

    @Test
    public void whenCount1to3Then6() {
        int start = 1;
        int finish = 3;
        int rst = Count.add(start, finish);
        int expected = 6;
        assertThat(rst).isEqualTo(expected);

    }
}