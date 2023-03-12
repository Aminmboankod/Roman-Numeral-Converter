package edu.craptocraft.romansNumbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {

    private String number;
    private String sumatorios = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|I{0,3}V|V?I{0,3})$";
    


    public RomanNumber(String number) {
        this.number = number;
        
    }

    /*
     * ------getters & setters--------
     */

    public String getSumatorios(){
        return this.sumatorios;
    }

    public String getNumber(){
        return this.number;
    }

    /*
     *-------logic methods---------
     */

    public int decimalValue(String number){
        
        int result = 0;
        RomanSymbol previousSymbol = null;
    
        for (int i = 0; i < number.length(); i++) {
            char currentChar = number.charAt(i);
            RomanSymbol currentSymbol = RomanSymbol.valueOf(String.valueOf(currentChar));
    
            if (previousSymbol != null && currentSymbol.getDecimalNumber() > previousSymbol.getDecimalNumber()) {
                result += currentSymbol.getDecimalNumber() - 2 * previousSymbol.getDecimalNumber();
            } else {
                result += currentSymbol.getDecimalNumber();
            }
    
            previousSymbol = currentSymbol;
        }
    
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


    /*
     * polymorfims methods
     */

    @Override
    public String toString() {
        return this.number;
    }
}
