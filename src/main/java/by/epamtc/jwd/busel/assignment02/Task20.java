package by.epamtc.jwd.busel.assignment02;


public class Task20 {
    private static String substituteSubstringUsingGeneralMethod(String text,
            String oldSubstring, String newSubstring) {
        return text.replaceAll(oldSubstring, newSubstring);
    }

    public static void main(String[] args) {
        String text = "Бусел Сергей Юрьевич - Сергей Юрьевич Бусел";

        String modifiedText1 = substituteSubstringUsingGeneralMethod(text,
                text.substring(6, 12), "Siarhei");

        System.out.println(modifiedText1);
    }
}
