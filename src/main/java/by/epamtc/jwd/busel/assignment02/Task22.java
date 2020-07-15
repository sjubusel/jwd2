package by.epamtc.jwd.busel.assignment02;

public class Task22 {
    private static final String WORD_SYMBOL = "[A-Za-zА-Яа-яёЁ-]";
    private static final String WORD_BOUNDARY_REGEX = "\\b";

    private static String deleteWordsByTheirLength(String text, int length) {
        StringBuilder sb = new StringBuilder();
        sb.append(WORD_BOUNDARY_REGEX).append(WORD_SYMBOL).append('{')
                .append(length).append('}').append(WORD_BOUNDARY_REGEX);
        String regEx = new String(sb);
        return text.replaceAll(regEx, "");

    }

    public static void main(String[] args) {
        String text = "a ab abc abcd abcde abcde abcd abc ab a";
        String modifiedText = deleteWordsByTheirLength(text, 2);
        System.out.println(modifiedText);
    }
}
