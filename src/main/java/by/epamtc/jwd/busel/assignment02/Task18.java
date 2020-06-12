package by.epamtc.jwd.busel.assignment02;

public class Task18 {
    private static String addWhiteSpace(String text, int offset) {
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.insert(6, " ");
        return new String(stringBuilder);
    }

    public static void main(String[] args) {
        String text = "СергейБусел";
        String modifiedText = addWhiteSpace(text, 6);
        System.out.println(modifiedText);
    }
}
