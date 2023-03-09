package edu.craptocraft.romansNumbers;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class RomanNumberTest {

    Object romanNumbers;

    @Before
    public void setupTest(){
        romanNumbers = List.of( "MMMDCCCLXXXVIII", // 3888
                                "MMDCCLXXVII",  // 2777
                                "CDXLIV", // 444
                                "CDXXXIX" // 439
                                ).stream()
                                .map(RomanNumber::new);
    }

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
    public void sum_all_Ones() {
        RomanNumber ones = new RomanNumber("III");
        assertEquals(3, ones.toDecimal());
    }
}
