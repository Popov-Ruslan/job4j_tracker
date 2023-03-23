package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    Error() {

    }

    Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void showInfo() {
        System.out.println("Is active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error errorDefault = new Error();
        errorDefault.showInfo();
        Error error = new Error(true, 5, "Критическая ошибка");
        error.showInfo();
    }
}
