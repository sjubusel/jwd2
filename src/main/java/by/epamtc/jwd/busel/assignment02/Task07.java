package by.epamtc.jwd.busel.assignment02;

public class Task07 {
    private static String deleteSubstring(String srcText, String subString) {
        return srcText.replace(subString, "");
    }

    public static void main(String[] args) {
        String text = "abcde12345";
        String modifiedText = deleteSubstring(text, "123");
        System.out.println(modifiedText);
    }
}
