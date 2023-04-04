package ru.job4j.pojo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ShopDropTest {
    @Test
    public void whenDropFirst() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rst = ShopDrop.delete(products, 0);
        assertThat(rst[0].getName()).isEqualTo("Bread");
        assertThat(rst[1]).isNull();
    }

    @Test
    public void whenDropLast() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rst = ShopDrop.delete(products, 1);
        assertThat(rst[0].getName()).isEqualTo("Milk");
        assertThat(rst[1]).isNull();
    }

    @Test
    public void whenArrayLengthIs4AndDeleteElementWithIndex1() {
        Product[] products = new Product[4];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);
        int index = 1;
        Product[] rst = ShopDrop.delete(products, index);
        assertThat(rst[index].getName()).isEqualTo("Milk");
        assertThat(rst[2].getName()).isEqualTo("Fish");
        assertThat(rst[products.length - 1]).isNull();
    }

    @Test
    public void whenArrayLengthIs5AndDeleteElementWithIndex2() {
        Product[] products = new Product[5];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);
        products[4] = new Product("Fruit", 8);
        int index = 2;
        Product[] rst = ShopDrop.delete(products, index);
        assertThat(rst[1].getName()).isEqualTo("Egg");
        assertThat(rst[index].getName()).isEqualTo("Fish");
        assertThat(rst[3].getName()).isEqualTo("Fruit");
        assertThat(rst[products.length - 1]).isNull();
    }
}