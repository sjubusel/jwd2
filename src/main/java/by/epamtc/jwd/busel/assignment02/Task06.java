package by.epamtc.jwd.busel.assignment02;

public class Task06 {
    private static String insertSubstring(String srcText, String substring,
            int offset) {
        StringBuilder stringBuilder = new StringBuilder(srcText);
        stringBuilder.insert(offset, substring);
        return new String(stringBuilder);
    }

    private static String insertSubstringIntoBeginning(String text,
            String subString) {
        return insertSubstring(text, subString, 0);
    }

    private static String insertSubstringToEnd(String text, String subString) {
        return new String(new StringBuilder(text).append(subString));
    }

    public static void main(String[] args) {
        String text = "abcdfg";
        String extendedText1 = insertSubstring(text, "123", 4);
        String extendedText2 = insertSubstringIntoBeginning(text,
                "456");
        String extendedText3 = insertSubstringToEnd(text, "789");
        System.out.println(extendedText1);
        System.out.println(extendedText2);
        System.out.println(extendedText3);

    }
}
