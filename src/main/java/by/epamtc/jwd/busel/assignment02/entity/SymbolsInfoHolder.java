package by.epamtc.jwd.busel.assignment02.entity;

public class SymbolsInfoHolder {
    private String text;
    private int lowerCaseLetterNumber;
    private int upperCaseLetterNumber;
    private double lowerCasePercentage;
    private double upperCasePercentage;

    public SymbolsInfoHolder(String text, int lowerCaseLetterNumber,
            int upperCaseLetterNumber) {
        this.text = text;
        this.lowerCaseLetterNumber = lowerCaseLetterNumber;
        this.upperCaseLetterNumber = upperCaseLetterNumber;
        this.lowerCasePercentage = (double) this.lowerCaseLetterNumber
                / this.text.length();
        this.upperCasePercentage = (double) this.upperCaseLetterNumber
                / this.text.length();
    }

    public SymbolsInfoHolder() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLowerCaseLetterNumber() {
        return lowerCaseLetterNumber;
    }

    public void setLowerCaseLetterNumber(int lowerCaseLetterNumber) {
        this.lowerCaseLetterNumber = lowerCaseLetterNumber;
    }

    public int getUpperCaseLetterNumber() {
        return upperCaseLetterNumber;
    }

    public void setUpperCaseLetterNumber(int upperCaseLetterNumber) {
        this.upperCaseLetterNumber = upperCaseLetterNumber;
    }

    public double getLowerCasePercentage() {
        return lowerCasePercentage;
    }

    public double getUpperCasePercentage() {
        return upperCasePercentage;
    }
}
