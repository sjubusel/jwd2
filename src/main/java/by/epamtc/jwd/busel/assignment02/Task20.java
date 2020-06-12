package by.epamtc.jwd.busel.assignment02;


public class Task20 {
    private static String substituteSubstring(String text, String oldSubstring,
            String newSubstring) {
        StringBuilder stringBuilder = new StringBuilder(text);
        int beginIndex = stringBuilder.indexOf(oldSubstring);
        stringBuilder.delete(beginIndex, beginIndex + oldSubstring.length());
        stringBuilder.insert(beginIndex, newSubstring);
        return new String(stringBuilder);
    }

    public static void main(String[] args) {
        String text = "Бусел Сергей Юрьевич";
        String modifiedText = substituteSubstring(text, text.substring(6, 12),
                "Siarhei");
        System.out.println(modifiedText);
    }
}
