package by.epamtc.jwd.busel.assignment02.entity;

public class EvenAndOddCharsHolder {
    private String evenChars;
    private String oddChars;

    public EvenAndOddCharsHolder(String evenChars, String oddChars) {
        this.evenChars = evenChars;
        this.oddChars = oddChars;
    }

    public EvenAndOddCharsHolder() {
    }

    public String getEvenChars() {
        return evenChars;
    }

    public void setEvenChars(String evenChars) {
        this.evenChars = evenChars;
    }

    public String getOddChars() {
        return oddChars;
    }

    public void setOddChars(String oddChars) {
        this.oddChars = oddChars;
    }
}
