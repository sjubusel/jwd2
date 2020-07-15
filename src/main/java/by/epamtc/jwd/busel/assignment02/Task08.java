package by.epamtc.jwd.busel.assignment02;

public class Task08 {
    private static String receiveSubstring(String text, int beginIndex,
            int endIndex) {
        String substring = text.substring(beginIndex, endIndex);
        return ((beginIndex == 0) && (endIndex == text.length()))
               ? new String(substring)
               : substring;
    }

    private static String receiveSubstring(String text, int beginIndex) {
        return receiveSubstring(text, beginIndex, text.length());
    }

    public static void main(String[] args) {
        String text = "abcdefg123gfedcba";
        String copyOfPartOfText = receiveSubstring(text, 7, 10);
        System.out.println(copyOfPartOfText);

        String copyOfText = receiveSubstring(text, 7);
        System.out.println(copyOfText);
    }
}
