package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rst = calculator.multiply(10);
        System.out.println(rst);
        int minus = minus(10);
        System.out.println(minus);
        int divide = calculator.divide(10);
        System.out.println(divide);
        int sumAll = calculator.sumAllOperation(10);
        System.out.println(sumAll);
    }
}
