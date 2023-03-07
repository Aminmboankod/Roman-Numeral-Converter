package edu.craptocraft.romansNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomansSymbolTest {
    


    @Test
    public void enum_symbol_value_Test(){

        assertEquals(1, RomansSymbol.I.getDecimalNumber());
        assertEquals(4, RomansSymbol.IV.getDecimalNumber());
        assertEquals(5, RomansSymbol.V.getDecimalNumber());
        assertEquals(10, RomansSymbol.X.getDecimalNumber());
        assertEquals(40, RomansSymbol.XL.getDecimalNumber());
        assertEquals(50, RomansSymbol.L.getDecimalNumber());
        assertEquals(90, RomansSymbol.XC.getDecimalNumber());
        assertEquals(100, RomansSymbol.C.getDecimalNumber());
        assertEquals(400, RomansSymbol.CD.getDecimalNumber());
        assertEquals(500, RomansSymbol.D.getDecimalNumber());
        assertEquals(900, RomansSymbol.CM.getDecimalNumber());
        assertEquals(1000, RomansSymbol.M.getDecimalNumber());

    }
}
