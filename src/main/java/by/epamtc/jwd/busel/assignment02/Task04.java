package by.epamtc.jwd.busel.assignment02;

public class Task04 {
    private static int findNumberOfCoincidences(String testLine, char a) {
        int number = 0;
        for (int i = 0; i < testLine.length(); i++) {
            if (a == testLine.charAt(i)) {
                number++;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        String testLine = "aaabbbcccdddfffaaabbbc";
        int numberOfCoincidences = findNumberOfCoincidences(testLine, 'c');
        System.out.printf("A number of character \"%c\" is %d.\n",
                'c', numberOfCoincidences);
    }
}
