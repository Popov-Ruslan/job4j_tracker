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

    /**
     * приватный, т.к. используется только внутри системы
     * @param id - уникальный id элемента, который требуется найти
     * @return индекс в массиве элемента с заданным id, или -1, если элемент
     * не найден
     */
    private int indexOf(int id) {
        int rst = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rst = index != -1;
        if (rst) {
            items[index] = item;
            item.setId(id);
        }
        return rst;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rst = index != -1;
        if (rst) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
        return rst;
    }
}