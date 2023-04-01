package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alex");
        student.setGroup("A2");
        student.setReceipt("2020");
        System.out.println(student.getName());
        System.out.println(student.getGroup());
        System.out.println(student.getReceipt());
    }
}
