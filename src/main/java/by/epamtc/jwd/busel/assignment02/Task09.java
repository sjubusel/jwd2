package by.epamtc.jwd.busel.assignment02;

public class Task09 {
    private static int defineStringLength(String text) {
        return text.length();
    }

    public static void main(String[] args) {
        String text = "1234567890qwerty";
        int length = defineStringLength(text);
        System.out.printf("The length of String \"%s\" is %d.\n", text, length);
    }
}
