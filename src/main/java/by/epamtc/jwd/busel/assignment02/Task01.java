package by.epamtc.jwd.busel.assignment02;

import by.epamtc.jwd.busel.assignment02.entity.EvenAndOddCharsHolder;

public class Task01 {

    private static EvenAndOddCharsHolder getEvenAndOddChars(String textLine) {
        StringBuilder evenCharsBuilder = new StringBuilder();
        StringBuilder oddCharsBuilder = new StringBuilder();
        for (int i = 0; i < textLine.length(); i++) {
            if ((i % 2) == 0) {
                evenCharsBuilder.append(textLine.charAt(i));
            } else {
                oddCharsBuilder.append(textLine.charAt(i));
            }
        }
        return new EvenAndOddCharsHolder(new String(evenCharsBuilder),
                new String(oddCharsBuilder));
    }


    public static void main(String[] args) {
        String textLine = "abcde1234567890";
        EvenAndOddCharsHolder charsHolder = getEvenAndOddChars(textLine);

        System.out.printf("Even characters: %s\n", charsHolder.getEvenChars());
        System.out.printf("Odd characters: %s\n", charsHolder.getOddChars());
    }
}
