package by.epamtc.jwd.busel.assignment02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
    private static String reverseWords(String text) {
        StringBuilder stringBuilder = new StringBuilder(text.length());
        Matcher matcher = Pattern.compile("[A-Za-zА-Яа-яЁё-]+").matcher(text);
        String delimiter = "";
        while (matcher.find()) {
            stringBuilder.insert(0, delimiter)
                    .insert(0, matcher.group());
            delimiter = ", ";
        }
        return new String(stringBuilder);
    }

    public static void main(String[] args) {
        String text = "Lorem 123 ipsum dolor sit amet, unde omnis iste natus " +
                "error sit voluptatem accusantium 123 doloremque laudantium, " +
                "totam исхrem aperiam eaque ipsa, facere 123 possimus, omnis " +
                " 123 voluptas assumenda код est, omnis dolor repellendus?";
        String textWithWordsInReverseOrder = reverseWords(text);
        System.out.print(textWithWordsInReverseOrder);
    }
}
