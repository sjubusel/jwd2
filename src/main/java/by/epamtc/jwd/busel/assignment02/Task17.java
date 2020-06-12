package by.epamtc.jwd.busel.assignment02;

public class Task17 {
    private static String deleteLastWord(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        int index = stringBuilder.lastIndexOf(" ");
        stringBuilder.delete(index, stringBuilder.length());
        return new String(stringBuilder);
    }

    public static void main(String[] args) {
        String text = "Lorem a ipsum dolor sit amet, unde что-то iste natus " +
                "error sit voluptatem accusantium doloremque laudantium, " +
                "totam rem aperiam eaque ipsa, facere possimus, omnis " +
                " voluptas assumenda est, omnis dolor repellendus?";
        String modifiedText = deleteLastWord(text);
        System.out.println(modifiedText);
    }
}
