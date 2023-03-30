package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport htmlReport = new HtmlReport();
        String text = htmlReport.generate("Header", "Body");
        System.out.println(text);
        JSONReport jsonReport = new JSONReport();
        text = jsonReport.generate("Header", "Body");
        System.out.println(text);
    }
}
