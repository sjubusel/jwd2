package by.epamtc.jwd.busel.assignment02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task15 {
    private static final String NOT_WORD_SYMBOLS = "[^A-Za-zА-Яа-яёЁ-]+";
    private static final String WORD_PATTERN = "\\b[A-Za-zА-Яа-яёЁ-]+\\b";

    private static int countWordsNumberUsingSplit(String text) {
        String[] words = text.split(NOT_WORD_SYMBOLS);
        return words.length;
    }

    private static int countWordsNumberUsingMatcher(String text) {
        Matcher matcher = Pattern.compile(WORD_PATTERN).matcher(text);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        String text = "Lorem a ipsum dolor sit amet, unde что-то iste natus " +
                "error sit voluptatem accusantium doloremque laudantium, " +
                "totam rem aperiam eaque ipsa, facere possimus, omnis " +
                " voluptas assumenda est, omnis dolor repellendus?";
        int wordsNumber1 = countWordsNumberUsingSplit(text);
        System.out.printf("Words number by Split: %d\n", wordsNumber1);
        int wordsNumber2 = countWordsNumberUsingMatcher(text);
        System.out.printf("Words number by Matcher: %d\n", wordsNumber2);
    }
}
