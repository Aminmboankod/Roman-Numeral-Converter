package edu.craptocraft.romansNumbers.romanrules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Esta clase representa un objeto "Número Romano" 
 * que contiene las reglas de la lógica numérica romana.
 * Las reglas se almacenan en romanNumbersRules y para acceder 
 * a ellas tienes que usar {@code getRomanNumbersRules()}
 * @param number es el número romano en formato String que quieres convertir a número decimal.
 * 
 * Ejemplo: MMMDCCCLXXXVIII --> 3888
 */
public class RomanNumber {

    private String number;
    private String romanNumbersRules = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|I{0,3}V|V?I{0,3})$";
     

    public RomanNumber(String number) {
        this.number = number;
        
    }

    /*
     * ------getters & setters--------
     */

    public String getRomanNumbersRules(){
        return this.romanNumbersRules;
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

        /**
         * Recorro el número decimal (String), donde cada número Romano será currentChar (char) 
         */

        for (int i = 0; i < number.length(); i++) {
            char currentChar = number.charAt(i);
            RomanSymbol currentSymbol = RomanSymbol.valueOf(String.valueOf(currentChar));

            /**
             * Si el valor decimal del símbolo actual es mayor al símbolo anterior, se resta el doble del valor del símbolo
             * anterior al valor del actual para poder sumar correctamente los valores decimales en caso de que sean sustrativos
             */

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
    public int toDecimal() {

        int result = 0;

        /* 
        * creo un matcher a partir del regex 
        * que almacena las reglas del UNO en numeros romanos 
        */

        String regex = this.getRomanNumbersRules();
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
