package by.epamtc.jwd.busel.assignment02;

public class Task23 {
    public static void main(String[] args) {
        String text = "Quis autem vel eum iure reprehenderit, unde omnis   " +
                "         iste natus error sit voluptatem accusantium " +
                "     doloremque             laudantium,   totam      rem    " +
                " aperiam eaque ipsa, quae        ab illo inventore veritatis" +
                " et quasi       architecto beatae vitae dicta sunt," +
                "                                                  explicabo!";
        String modifiedString = deleteExcessWhiteSpaces(text);
        System.out.println(modifiedString);
    }

    private static String deleteExcessWhiteSpaces(String text) {

        return text.replaceAll("[\\p{Space}]{2,}", " ");
    }
}
