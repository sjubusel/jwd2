package by.epamtc.jwd.busel.assignment02;

public class Task22 {
    private static String deleteWordsByTheirLength(String text, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        String delimiter = "";
        String[] words = text.split("[^A-Za-zА-Яа-яёЁ]+");
        for (String word : words) {
            if (word.length() != length) {
                stringBuilder.append(delimiter).append(word);
                delimiter = ", ";
            }
        }
        return new String(stringBuilder);
    }

    public static void main(String[] args) {
        String text = "a ab abc abcd abcde abcde abcd abc ab a";
        String modifiedText = deleteWordsByTheirLength(text, 2);
        System.out.println(modifiedText);
    }
}
