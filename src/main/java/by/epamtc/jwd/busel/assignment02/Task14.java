package by.epamtc.jwd.busel.assignment02;

public class Task14 {
    private static int getShortestWordLength(String text) {
        String[] words = text.split("[^A-Za-zА-Яа-яёЁ-]+");
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
        int lengthShortestWord = getShortestWordLength(text);
        System.out.println(lengthShortestWord);
    }
}
