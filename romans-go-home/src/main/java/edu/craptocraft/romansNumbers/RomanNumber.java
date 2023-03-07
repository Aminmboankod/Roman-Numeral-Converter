package edu.craptocraft.romansNumbers;

public class RomanNumber {

    private final String number;
    private Integer decimal = 0;

    public RomanNumber(String number) {
        this.number = number;
        
    }

    public Object toDecimal() {
        return null;
    }

    @Override
    public String toString() {
        return this.number;
    }

}
