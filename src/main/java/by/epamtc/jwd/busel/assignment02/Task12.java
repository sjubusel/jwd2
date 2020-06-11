package by.epamtc.jwd.busel.assignment02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task12 {
    private static String replaceWhitespacesWithAsterisk(String text) {
        String regExp = "[\\p{Space}]+";
        Matcher matcher = Pattern.compile(regExp).matcher(text);
        return matcher.replaceAll("*");
    }

    public static void main(String[] args) {
        String text = "Lorem \t ipsum dolor sit amet, unde omnis iste natus " +
                "error sit voluptatem accusantium     doloremque laudantium, " +
                "totam rem aperiam eaque ipsa, facere 123 possimus, omnis " +
                "\n 123 voluptas assumenda est, omnis dolor repellendus?";

        String modifiedText = replaceWhitespacesWithAsterisk(text);
        System.out.println(modifiedText);
    }
}
