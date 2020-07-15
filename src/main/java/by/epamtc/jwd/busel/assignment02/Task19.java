package by.epamtc.jwd.busel.assignment02;

public class Task19 {
    private static final String NOT_WORD_SYMBOLS = "[^0-9A-Za-zА-Яа-яёЁ-]+";

    private static boolean findOutIfPalindrome(String text) {
        String editedText = text.replaceAll(NOT_WORD_SYMBOLS, "");
        StringBuilder reverseEditedText = new StringBuilder(editedText).reverse();
        return editedText.equalsIgnoreCase(new String(reverseEditedText));
    }

    public static void main(String[] args) {
        // Латинский язык: Я - сильная мышь
        String text = "Sum summus mus";
        boolean isPalindrome = findOutIfPalindrome(text);
        System.out.print(isPalindrome);
    }

}
