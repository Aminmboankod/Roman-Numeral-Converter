package edu.craptocraft.romansNumbers;

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
        assertEquals(3, ones.resultSumatory());

        RomanNumber someOnes = new RomanNumber("UIIIU");
        assertEquals(3, someOnes.resultSumatory());
    }

    @Test
    public void fives() {
        RomanNumber fives = new RomanNumber("V");
        assertEquals(5, fives.resultSumatory());


        /*
         * En el siguiente caso no debe de sumarse porque la expresión correcta
         * sería XV y no VVV como le paso en el test
         */
        RomanNumber errorFive = new RomanNumber("VVV");
        assertEquals(0, errorFive.resultSumatory());

    }
}
