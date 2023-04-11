package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Я великий Оракул. Что ты хочешь знать?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        int random = new Random().nextInt(3);
        switch (random) {
            case 0:
                System.out.println("Нет");
                break;
            case 1:
                System.out.println("Да");
                break;
            default:
                System.out.println("Может быть");
        }
    }
}
