package by.epamtc.jwd.busel.assignment02;

public class Task15 {
    private static int countWordsNumber(String text) {
        String[] words = text.split("[^A-Za-zА-Яа-яЁё-]+");
        return words.length;
    }

    public static void main(String[] args) {
        String text = "Lorem a ipsum dolor sit amet, unde что-то iste natus " +
                "error sit voluptatem accusantium doloremque laudantium, " +
                "totam rem aperiam eaque ipsa, facere possimus, omnis " +
                " voluptas assumenda est, omnis dolor repellendus?";
        int wordsNumber = countWordsNumber(text);
        System.out.println(wordsNumber);
    }
}
