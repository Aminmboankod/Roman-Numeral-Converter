package edu.craptocraft.romansNumbers;



public class RomanNumber {

    private final String number;
    private Integer decimal = 0;


    public RomanNumber(String number) {
        this.number = number;
        
    }

    public Object toDecimal() {
        return resultSumatory();
    }

    public int decimalValue(String number){
        RomanSymbol symbol = Enum.valueOf(RomanSymbol.class, String.valueOf(number));
        return symbol.getDecimalNumber();
    }

    public String getNumber(){
        return this.number;
    } 

    public int resultSumatory(){

        int result = 0;
        for (char c : number.toCharArray()) {

            //Convierto a string cada carácter y se lo paso a decimalValue
            int value = decimalValue(Character.toString(c)); 

            if (value == 1) {
                result += value;
            }
        }
        return result;
    }


    @Override
    public String toString() {
        return this.number;
    }
}
