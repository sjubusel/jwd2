package by.epamtc.jwd.busel.assignment02;

public class Task14 {
    private static final String NOT_WORD_SYMBOLS = "[^A-Za-zА-Яа-яёЁ-]+";

    private static int findShortestWordLength(String text) {
        String[] words = text.split(NOT_WORD_SYMBOLS);
        int minLength = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < minLength) {
                minLength = words[i].length();
            }
        }
        return minLength;
    }

    public static void main(String[] args) {
        String text = "Lorem a ipsum dolor sit amet, unde что-то iste natus " +
                "error sit voluptatem accusantium doloremque laudantium, " +
                "totam rem aperiam eaque ipsa, facere possimus, omnis " +
                " voluptas assumenda est, omnis dolor repellendus?";
        int lengthShortestWord = findShortestWordLength(text);
        System.out.println(lengthShortestWord);
    }
}
