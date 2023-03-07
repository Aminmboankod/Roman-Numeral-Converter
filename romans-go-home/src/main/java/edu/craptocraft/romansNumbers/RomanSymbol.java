package edu.craptocraft.romansNumbers;

public enum RomanSymbol {
    
    I(1),
    IV(4), 
    V(5),
    X(10),
    XL(40),
    L(50),
    XC(90),
    C(100),
    CD(400),
    D(500),
    CM(900),
    M(1000);


    private int decimal;


    RomanSymbol(int decimal) {
        this.decimal = decimal;
    }


    int getDecimalNumber() {
        return this.decimal;
    }






}
