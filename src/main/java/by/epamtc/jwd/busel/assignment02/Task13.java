package by.epamtc.jwd.busel.assignment02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task13 {
    private static final String NOT_WORD_SYMBOLS = "[^A-Za-zА-Яа-яёЁ-]+";
    private static final String WORD_SYMBOL = "[A-Za-zА-Яа-яёЁ-]";

    private static String replaceLettersOfLongestWord(String text,
            char oldChar, char newChar) {
        String[] words = text.split(NOT_WORD_SYMBOLS);
        int maxLength = getMaxLengthOfWord(words);
        String regEx = buildRegExToMatchWordOfSomeLength(maxLength);
        Matcher matcher = Pattern.compile(regEx).matcher(text);

        StringBuilder stringBuilder = new StringBuilder(text);
        /*
        matcher is used instead of "for loop" through an array "words" in order
        to save punctuation marks
         */
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String newWord = matcher.group().replace(oldChar, newChar);
            stringBuilder.replace(start, end, newWord);
        }
        return new String(stringBuilder);
    }

    private static String buildRegExToMatchWordOfSomeLength(int wordLength) {
        return String.format("\\b%s{%d}\\b", WORD_SYMBOL, wordLength);
    }

    private static int getMaxLengthOfWord(String[] words) {
        int max = 0;
        for (String word : words) {
            if (max < word.length()) {
                max = word.length();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, unde что-то iste natus " +
                "error sit voluptatem СЛОВО accusantium СЛОВО doloremque " +
                "laudantium, totam rem aperiam eaque ipsa, facere possimus, omnis " +
                " voluptas assumenda est, omnis dolor СЛОВО rapellendus СЛОВО?";
        String modifiedText = replaceLettersOfLongestWord(text, 'a', 'b');
        System.out.println(modifiedText);

        String text2 = "aaaaaaccaaaaaaa b fsdhjk fsdjfs rgdf aaaaaccaaaaaaaa";
        String modifiedText2 = replaceLettersOfLongestWord(text2, 'a', 'b');
        System.out.println(modifiedText2);
    }
}
