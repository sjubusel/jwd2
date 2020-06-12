package by.epamtc.jwd.busel.assignment02;

public class Task19 {
    private static boolean findOutIfPalindrome(String text) {
        String editedText = text.replaceAll("[^A-Za-zА-Яа-яёЁ]+", "");
        StringBuilder reverseEditedText = new StringBuilder(editedText).reverse();
        return editedText.equalsIgnoreCase(new String(reverseEditedText));
    }

    public static void main(String[] args) {
        String text = "Sum summus mus";
        boolean isPalindrome = findOutIfPalindrome(text);
        System.out.print(isPalindrome);
    }

}
