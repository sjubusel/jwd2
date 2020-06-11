package by.epamtc.jwd.busel.assignment02;

public class Task10 {
    private static int getNumberOfSubstringCoincidences(String text,
            String substring) {
        int number = 0;
        int fromIndex = 0;
        final int i = text.indexOf(substring, fromIndex);
        while ((fromIndex = text.indexOf(substring, fromIndex)) != -1) {
            number++;
            fromIndex += substring.length();
        }
        return number;
    }

    public static void main(String[] args) {
        String text = "Lorem 123 ipsum dolor sit amet, unde omnis iste natus " +
                "error sit voluptatem accusantium 123 doloremque laudantium, " +
                "totam rem aperiam eaque ipsa, facere 123 possimus, omnis " +
                " 123 voluptas assumenda est, omnis dolor repellendus?";
        int coincidencesNumber = getNumberOfSubstringCoincidences(text,
                "123");
        System.out.printf("Substring \"123\" is found \"%d\" times.\n",
                coincidencesNumber);
    }
}
