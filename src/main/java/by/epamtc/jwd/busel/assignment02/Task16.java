package by.epamtc.jwd.busel.assignment02;

public class Task16 {

    private static void makeOneRearrangement(StringBuilder stringBuilder,
            String oldWord, String newWord, int beginningIndex) {
        stringBuilder.delete(beginningIndex, beginningIndex + oldWord.length());
        stringBuilder.insert(beginningIndex, newWord);
    }

    private static String rearrangeWords(String srcText, String word1,
            String word2) {
        StringBuilder sb = new StringBuilder(srcText);
        int pointer = 0;
        int nextIndOfWord1 = sb.indexOf(word1, pointer);
        int nextIndOfWord2 = sb.indexOf(word2, pointer);
        while (true) {
            if (nextIndOfWord1 >= 0 && nextIndOfWord2 >= 0) {
                if (nextIndOfWord1 < nextIndOfWord2) {
                    makeOneRearrangement(sb, word1, word2, nextIndOfWord1);
                    pointer = nextIndOfWord1 + word2.length();
                } else {
                    makeOneRearrangement(sb, word2, word1, nextIndOfWord2);
                    pointer = pointer + word1.length();
                }
            } else if (nextIndOfWord1 < 0 && nextIndOfWord2 > 0) {
                makeOneRearrangement(sb, word2, word1, nextIndOfWord2);
                pointer = pointer + word1.length();
            } else if (nextIndOfWord1 > 0) {
                makeOneRearrangement(sb, word1, word2, nextIndOfWord1);
                pointer = nextIndOfWord1 + word2.length();
            } else {
                break;
            }
            nextIndOfWord1 = sb.indexOf(word1, pointer);
            nextIndOfWord2 = sb.indexOf(word2, pointer);
        }
        return new String(sb);
    }

    public static void main(String[] args) {
        String text = "Предложение предложение предложение простое простое";
        String modifiedText = rearrangeWords(text, "предложение",
                "простое");
        System.out.println(modifiedText);
        String text2 = "слово прилагательное прилагательное прилагательное";
        final String rearrangeWords = rearrangeWords(text2,
                "прилагательное", "слово");
        System.out.println(rearrangeWords);
    }
}
