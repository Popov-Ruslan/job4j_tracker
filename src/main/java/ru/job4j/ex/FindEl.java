package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rst = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rst = i;
                break;
            }
        }
        if (rst == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rst;
    }

    public static void main(String[] args) {
        String[] text = {"Just", "do", "it"};
        try {
            FindEl.indexOf(text, "already");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
