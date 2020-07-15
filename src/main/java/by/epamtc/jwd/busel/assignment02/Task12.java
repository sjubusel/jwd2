package by.epamtc.jwd.busel.assignment02;

public class Task12 {
    private static final String WHITESPACES = "[\\p{Space}]+";

    private static String replaceWhitespacesWithAsterisk(String text) {
        return text.replaceAll(WHITESPACES, "*");
    }

    public static void main(String[] args) {
        String text = "Lorem \t ipsum dolor sit amet, unde omnis iste natus " +
                "error sit voluptatem accusantium     doloremque laudantium, " +
                "totam rem aperiam eaque ipsa, facere 123 possimus, omnis " +
                "\n 123 voluptas assumenda est, omnis dolor repellendus?";

        String modifiedText = replaceWhitespacesWithAsterisk(text);
        System.out.println(modifiedText);
    }
}
