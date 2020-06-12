package by.epamtc.jwd.busel.assignment02;

public class Task24 {
    private static String[] extractWordsFromString(String text) {
        return text.split("[^A-Za-zА-Яа-яёЁ]+");
    }

    public static void main(String[] args) {
        String text = "At vero eos et accusamus et iusto odio dignissimos" +
                " ducimus, unde omnis iste natus error sit voluptatem" +
                " accusantium doloremque laudantium, totam rem aperiam eaque" +
                " ipsa, qui dolorem ipsum, quia dolor sit, amet, consectetur," +
                " adipisci velit, sed quia non numquam eius modi tempora" +
                " incidunt, ut labore et dolore magnam aliquam quaerat" +
                " voluptatem! Excepteur sint occaecat cupidatat non proident," +
                " consectetur adipiscing elit, quae ab illo inventore veritatis" +
                " et quasi architecto beatae vitae dicta sunt, explicabo!";
        String[] words = extractWordsFromString(text);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
