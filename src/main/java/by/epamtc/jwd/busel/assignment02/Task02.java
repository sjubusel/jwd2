package by.epamtc.jwd.busel.assignment02;

import by.epamtc.jwd.busel.assignment02.entity.SymbolsInfoHolder;

public class Task02 {
    private static SymbolsInfoHolder receiveSymbolsInfo(String textLine) {
        int lowercaseLetterNumber = 0;
        int uppercaseLetterNumber = 0;
        for (int i = 0; i < textLine.length(); i++) {
            char symbol = textLine.charAt(i);
            if (Character.isLetter(symbol)) {
                if (Character.isLowerCase(symbol)) {
                    lowercaseLetterNumber++;
                } else {
                    uppercaseLetterNumber++;
                }
            }
        }
        return new SymbolsInfoHolder(textLine, lowercaseLetterNumber,
                uppercaseLetterNumber);
    }

    public static void main(String[] args) {
        String textLine = "Я узнал, что у меня\n" +
                "Есть огромная семья\n" +
                "И тропинка и лесок\n" +
                "В поле каждый колосок\n" +
                "Речка, небо голубое -\n" +
                "Это все мое родное\n" +
                "Это Родина моя,\n" +
                "Всех люблю на свете я!";
        SymbolsInfoHolder symbolsInfoHolder = receiveSymbolsInfo(textLine);

        System.out.printf("Lowercase percentage: %g\n",
                symbolsInfoHolder.getLowerCasePercentage());
        System.out.printf("Uppercase percentage: %g\n",
                symbolsInfoHolder.getUpperCasePercentage());
    }
}
