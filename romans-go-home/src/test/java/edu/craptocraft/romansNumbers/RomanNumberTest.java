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


    @Test
    public void toString_Test(){
        RomanNumber hundred = new RomanNumber("C"); 
        assertEquals("C", hundred.toString());
    }


    @Test
    public void decimalValueTest() {
        RomanNumber hundred = new RomanNumber("C");
        assertEquals(100, hundred.decimalValue("C"));
    }



}
