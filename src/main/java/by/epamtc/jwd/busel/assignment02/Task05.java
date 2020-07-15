package by.epamtc.jwd.busel.assignment02;


public class Task05 {
    private static String receiveReverseString(String textLine) {
        StringBuilder reversedText = new StringBuilder(textLine).reverse();
        return new String(reversedText);
    }

    public static void main(String[] args) {
        String textLine = "abcdefg";
        String reversedLine = receiveReverseString(textLine);
        System.out.println(reversedLine);
    }
}
