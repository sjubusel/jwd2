package by.epamtc.jwd.busel.assignment02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task13 {
    private static String replaceLettersOfLongestWord(String text,
            char oldChar, char newChar) {
        String[] words = text.split("[^A-Za-zА-Яа-яёЁ-]+");
        int max = getMaxLengthOfWord(words);
        Matcher matcher = Pattern.compile(String.format("[A-Za-zА-Яа-яёЁ-]{%d}",
                max)).matcher(text);
        StringBuilder stringBuilder = new StringBuilder(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String newWord = matcher.group().replace(oldChar, newChar);
            stringBuilder.replace(start, end, newWord);
        }
        return new String(stringBuilder);

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
                "error sit voluptatem accusantium doloremque laudantium, " +
                "totam rem aperiam eaque ipsa, facere possimus, omnis " +
                " voluptas assumenda est, omnis dolor repellendus?";
        String modifiedText = replaceLettersOfLongestWord(text, 'a', 'b');
        System.out.println(modifiedText);

        String text2 = "aaaaaaccaaaaaaa b fsdhjk fsdjfs rgdf aaaaaccaaaaaaaa";
        String modifiedText2 = replaceLettersOfLongestWord(text2, 'a', 'b');
        System.out.println(modifiedText2);
    }
}
