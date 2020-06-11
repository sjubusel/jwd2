package by.epamtc.jwd.busel.assignment02;


public class Task05 {
    private static String getReverseString(String textLine) {
        StringBuilder reversedText = new StringBuilder(textLine).reverse();
        return new String(reversedText);
    }

    public static void main(String[] args) {
        String textLine = "abcdefg";
        String reversedLine = getReverseString(textLine);
        System.out.println(reversedLine);
    }
}
