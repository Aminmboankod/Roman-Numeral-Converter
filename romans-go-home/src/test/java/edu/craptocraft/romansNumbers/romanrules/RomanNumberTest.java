package edu.craptocraft.romansNumbers.romanrules;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class RomanNumberTest {

    
    /* Probamos el correcto funcionamiento del método toString para 
    ** transcribir los números romanos en el mismo formato */
    @Test
    public void toString_Test(){
        RomanNumber hundred = new RomanNumber("C"); 
        assertEquals("C", hundred.toString());
    }


    /* Comprobar que el método decimalValue de la clase "RomanNumber"
     * devuelva correctamente el valor decimal de un número romano
     */

    @Test
    public void decimalValueTest() {
        RomanNumber hundred = new RomanNumber("MMMDCCCLXXXVIII");
        assertEquals(1, hundred.decimalValue("I"));
        assertEquals(100, hundred.decimalValue("C"));
        assertEquals(1000, hundred.decimalValue("M"));
    }


    /* Comprobar funcionalidad del sistema aditivo */
    @Test
    public void sum_all_ones() {
        RomanNumber ones = new RomanNumber("III");
        assertEquals(3, ones.toDecimal());


        /*Si encuentra un valor no válido devuelve 0 */
        RomanNumber someOnes = new RomanNumber("UIIIU");
        assertEquals(0, someOnes.toDecimal());

        RomanNumber toManyOnes = new RomanNumber("IIIII");
        assertEquals(0, toManyOnes.toDecimal());

    }

    @Test
    public void fives() {
        RomanNumber fives = new RomanNumber("V");
        assertEquals(5, fives.toDecimal());


        /*
         * En el siguiente caso no debe de sumarse porque la expresión correcta
         * sería XV y no VVV como le paso en el test
         */
        RomanNumber errorFive = new RomanNumber("VVV");
        assertEquals(0, errorFive.toDecimal());

    }

    @Test
    public void tenSymbol() {
        RomanNumber ten = new RomanNumber("X");
        assertEquals(10, ten.toDecimal());

        RomanNumber thirty = new RomanNumber("XXX");
        assertEquals(30, thirty.toDecimal());

        RomanNumber errorThirty = new RomanNumber("XXXXXXXXXXXX");
        assertEquals(0, errorThirty.toDecimal());

    }

    @Test
    public void normalNumberRoman() {
        RomanNumber firsRomanNumber = new RomanNumber("MMMDCCCLXXXVIII");
        assertEquals(3888, firsRomanNumber.toDecimal());

        RomanNumber secondRomanNumber = new RomanNumber("CDXLIV");
        assertEquals(444, secondRomanNumber.toDecimal());
    }
}
