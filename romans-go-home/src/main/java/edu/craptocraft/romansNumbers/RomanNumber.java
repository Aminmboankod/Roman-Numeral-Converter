package edu.craptocraft.romansNumbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {

    private String number;
    private String sumatorios = "I(?![VX])";


    public RomanNumber(String number) {
        this.number = number;
        
    }

    public String getSumatorios(){
        return this.sumatorios;
    }

    public String getNumber(){
        return this.number;
    } 

    public Object toDecimal() {
        return resultSumatory();
    }

    public int decimalValue(String number){
        
        RomanSymbol symbol;
        int result = 0;
    
        symbol = Enum.valueOf(RomanSymbol.class, String.valueOf(number));   
        result = symbol.getDecimalNumber(); 
        return result;
    }

    /* 
    *devuelvo la suma de los valores decimales de los símbolos
    */
    public int resultSumatory() {

        int result = 0;

        /* 
        * creo un matcher a partir del regex 
        * que almacena las reglas del UNO en numeros romanos 
        */
        
        String regex = this.getSumatorios();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(this.getNumber());

        while (matcher.find()) {
            result += this.decimalValue(matcher.group());
        }
        return result;
    }



    @Override
    public String toString() {
        return this.number;
    }
}
