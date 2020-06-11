package by.epamtc.jwd.busel.assignment02;

public class Task03 {
    private static String deleteRepetitiveSymbols(String line) {
        StringBuilder stringBuilder = new StringBuilder(line);
        for (int i = 0; i < stringBuilder.length(); i++) {
            String character = String.valueOf(stringBuilder.charAt(i));
            int pointer = i;
            int indexToDelete;
            while ((pointer++ < (stringBuilder.length() - 1))
                    && (indexToDelete = stringBuilder.indexOf(character,
                    pointer)) != -1) {
                stringBuilder.deleteCharAt(indexToDelete);
            }
        }
        return new String(stringBuilder);
    }

    public static void main(String[] args) {
        String line = "abcdabcd123123";
        String newLine = deleteRepetitiveSymbols(line);
        System.out.println(newLine);
    }
}
