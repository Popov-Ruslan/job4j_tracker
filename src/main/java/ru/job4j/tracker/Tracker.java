package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /**
     * поскольку size увеличивается только при заполнении элемента массива,
     * просто обрезаем массив items
     * @return все заполненные элементы массива без null элементов
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rst = new Item[size];
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                rst[quantity] = items[i];
                quantity++;
            }
        }
        return Arrays.copyOf(rst, quantity);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}