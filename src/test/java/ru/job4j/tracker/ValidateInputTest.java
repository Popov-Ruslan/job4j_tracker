package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"3"}
        );
        ValidateInput validateInput = new ValidateInput(out, in);
        int rst = validateInput.askInt("Enter menu:");
        assertThat(rst).isEqualTo(3);
    }

    @Test
    public void whenMultipleValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"4", "10"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int rst = input.askInt("Enter menu:");
        assertThat(rst).isEqualTo(4);
        rst = input.askInt("Enter menu:");
        assertThat(rst).isEqualTo(10);
    }

    @Test
    public void whenNegativeInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-2", "4"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int rst = input.askInt("Enter menu:");
        assertThat(rst).isEqualTo(-2);
    }
}