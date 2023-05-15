package ru.job4j.tracker;

public class ValidateInput implements Input {
    private final Output out;
    private final Input in;

    public ValidateInput(Output out, Input in) {
        this.out = out;
        this.in = in;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        int rst = -1;
        boolean run = true;
        while (run) {
            try {
                rst = Integer.parseInt(askStr(question));
                run = false;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number of menu item");
            }
        }
        return rst;
    }
}
