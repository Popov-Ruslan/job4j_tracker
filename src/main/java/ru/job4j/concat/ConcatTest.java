package ru.job4j.concat;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("Job4j");
        for (int i = 0; i < 9999; i++) {
            s.append(i);
        }
        System.out.println(System.currentTimeMillis() - startTime);
        String str = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(str);
        str = String.join(" ", "abc", "def", "ghi");
        System.out.println(str);
    }
}
