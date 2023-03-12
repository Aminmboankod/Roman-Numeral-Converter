package edu.craptocraft.romansNumbers;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import edu.craptocraft.romansNumbers.romanrules.RomanSymbol;

public class RomansSymbolTest {
    


    @Test
    public void enum_symbol_value_Test(){

        assertEquals(1, RomanSymbol.I.getDecimalNumber());
        assertEquals(4, RomanSymbol.IV.getDecimalNumber());
        assertEquals(5, RomanSymbol.V.getDecimalNumber());
        assertEquals(10, RomanSymbol.X.getDecimalNumber());
        assertEquals(40, RomanSymbol.XL.getDecimalNumber());
        assertEquals(50, RomanSymbol.L.getDecimalNumber());
        assertEquals(90, RomanSymbol.XC.getDecimalNumber());
        assertEquals(100, RomanSymbol.C.getDecimalNumber());
        assertEquals(400, RomanSymbol.CD.getDecimalNumber());
        assertEquals(500, RomanSymbol.D.getDecimalNumber());
        assertEquals(900, RomanSymbol.CM.getDecimalNumber());
        assertEquals(1000, RomanSymbol.M.getDecimalNumber());

    }

}
