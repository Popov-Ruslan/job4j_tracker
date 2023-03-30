package ru.job4j.inheritance;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class JSONReportTest {
    @Test
    public void whenTestGenerateMethod() {
        String name = "Header";
        String body = "Body";
        String rst = new JSONReport().generate(name, body);
        String ln = System.lineSeparator();
        String expected = "{" + ln
                + "\t\"name\" : \"Header\"," + ln
                + "\t\"body\" : \"Body\"" + ln
                + "}";
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenNameIsDavidBodyIsNameSong() {
        String name = "David Gilmour";
        String body = "Shine on you crazy diamond";
        String rst = new JSONReport().generate(name, body);
        String ln = System.lineSeparator();
        String expected = "{" + ln
                + "\t\"name\" : \"David Gilmour\"," + ln
                + "\t\"body\" : \"Shine on you crazy diamond\"" + ln
                + "}";
        assertThat(rst).isEqualTo(expected);
    }

}