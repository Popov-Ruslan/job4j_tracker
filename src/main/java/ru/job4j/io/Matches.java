package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        boolean p1move = true;
        System.out.println("""
                Игра спички.
                На столе 11 спичек.
                2 игрока тянут спички от 1 до 3 по очереди.
                Побеждает тот, кто вытянул спички последним""");
        while (matches > 0) {
            if (p1move) {
                System.out.println("Игрок 1 тянет спички:");
            } else {
                System.out.println("Игрок 2 тянет спички:");
            }
            int move = Integer.parseInt(input.nextLine());
            if (move < 1 || move > 3) {
                System.out.println("Введите число от 1 до 3");
            } else {
                matches -= move;
                if (matches <= 0) {
                    break;
                }
                System.out.println("Осталось " + matches + " спичек");
                p1move = !p1move;
            }
        }
        if (p1move) {
            System.out.println("Победил Игрок 1");
        } else {
            System.out.println("Победил Игрок 2");
        }
    }
}
