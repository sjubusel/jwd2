package by.epamtc.jwd.busel.assignment02;

import java.math.BigInteger;

public class Task21 {
    private static String performAdditionOfWholeNumbersViaString(String summand,
            String addend) {
        int unitsNumber = findNumberOfEightDigitUnits(summand, addend);
        StringBuilder sBuilder = new StringBuilder(unitsNumber * 8);
        StringBuilder summandBuilder = new StringBuilder(summand);
        StringBuilder addendBuilder = new StringBuilder(addend);
        int[] eightDigitNumbers = obtainArrayRepresentationOfResult(unitsNumber,
                summandBuilder, addendBuilder);
        return formResultViaString(eightDigitNumbers, sBuilder);
    }

    private static int findNumberOfEightDigitUnits(String summand, String addend) {
        int unitsNumberOf1st = (int) Math.ceil(1.0 * summand.length() / 8);
        int unitsNumberOf2nd = (int) Math.ceil(1.0 * addend.length() / 8);
        return Math.max(unitsNumberOf1st, unitsNumberOf2nd) + 1;
    }

    private static int[] obtainArrayRepresentationOfResult(int unitsNumberByEight,
            StringBuilder summandBuilder, StringBuilder addendBuilder) {
        int[] eightDigitNumbers = new int[unitsNumberByEight];
        int appendix = 0;
        for (int i = 0; i < eightDigitNumbers.length; i++) {
            int summandEightDigitNumber = findEightDigitByUnit(summandBuilder);
            int addendEightDigitNumber = findEightDigitByUnit(addendBuilder);
            int sum = summandEightDigitNumber + addendEightDigitNumber
                    + appendix;
            if (sum < 100_000_000) {
                eightDigitNumbers[i] = sum;
                appendix = 0;
            } else {
                eightDigitNumbers[i] = sum - 100_000_000;
                appendix = 1;
            }
        }
        return eightDigitNumbers;
    }

    private static int findEightDigitByUnit(StringBuilder summand) {
        int length = summand.length();
        int result = 0;
        if (length > 0) {
            String stringRepresentation;
            if (summand.length() >= 8) {
                stringRepresentation = summand.substring(length - 8, length);
                summand.delete(length - 8, length);
            } else {
                stringRepresentation = summand.substring(0, length);
                summand.delete(0, length);
            }
            result = Integer.parseInt(stringRepresentation);
        }
        return result;
    }

    private static String formResultViaString(int[] sourceArray,
            StringBuilder destBuilder) {
        for (int value : sourceArray) {
            String str = String.valueOf(value);
            destBuilder.insert(0, str);
            for (int j = 0; j < 8 - str.length(); j++) {
                destBuilder.insert(0, "0");
            }
        }
        return cutUnnecessaryZeros(destBuilder);
    }

    private static String cutUnnecessaryZeros(StringBuilder destBuilder) {
        int end = 0;
        for (int i = 0; i < destBuilder.length(); i++) {
            if (destBuilder.charAt(i) != '0') {
                end = i;
                break;
            }
        }
        destBuilder.delete(0, end);
        return new String(destBuilder);
    }

    public static void main(String[] args) {
        String summand = "32131231248798797789798798778979879879879798788" +
                "79898798798798317982342";
        String addend = "43242342354354354353478979879879879879879897878799879";
        String sum = performAdditionOfWholeNumbersViaString(summand, addend);
        System.out.printf("RESULT BY A CUSTOM METHOD:  %s\n", sum);

        BigInteger bigInteger1 = new BigInteger(summand);
        BigInteger bigInteger2 = new BigInteger(addend);
        System.out.printf("RESULT BY BIGINTEGER CLASS: %s\n",
                bigInteger1.add(bigInteger2));

    }
}
