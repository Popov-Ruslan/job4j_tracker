package ru.job4j.pojo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShopTest {
    @Test
    public void whenLastNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Butter", 2);
        products[2] = new Product("Sausage", 2);
        int rst = Shop.indexOfNull(products);
        int expected = 3;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whefFirstNull() {
        Product[] products = new Product[5];
        products[1] = new Product("Milk", 10);
        int rst = Shop.indexOfNull(products);
        int expected = 0;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenHasNotNull() {
        Product[] products = new Product[1];
        products[0] = new Product("Bread", 2);
        int rst = Shop.indexOfNull(products);
        int expected = -1;
        assertThat(rst).isEqualTo(expected);
    }
}