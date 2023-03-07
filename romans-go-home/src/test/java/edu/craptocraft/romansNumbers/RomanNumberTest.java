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

    // /* Grupos sumatorios */

    // @Test
    // public void sum_only_M_Test(){

    //     RomanNumber threeHundred = new RomanNumber("MMM");
    //     assertEquals(300, threeHundred.toDecimal());

    // }


}
