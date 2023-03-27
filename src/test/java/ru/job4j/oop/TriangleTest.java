package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rst = triangle.area();
        double expected = 8;
        assertThat(rst).isCloseTo(expected,     offset(0.001));
    }

    @Test
    public void whenNotExist() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 0);
        Point third = new Point(4, 4);
        Triangle triangle = new Triangle(first, second, third);
        double rst = triangle.area();
        double expected = -1;
        assertThat(rst).isCloseTo(expected, offset(0.001));
    }
}