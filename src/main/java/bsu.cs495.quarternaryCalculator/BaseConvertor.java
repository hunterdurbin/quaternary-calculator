package bsu.cs495.quarternaryCalculator;

import static java.lang.StrictMath.abs;

public class BaseConvertor {
    private final int BASE10 = 10;
    private final int BASE4 = 4;

    public int base10To4(int base10Number) {
        String quaternaryStr = "";
        int remainingToAdd = abs(base10Number);
        boolean negative = isNegative(base10Number);
        while (remainingToAdd > 0) {
            int nextDigit = remainingToAdd % BASE4;
            remainingToAdd = remainingToAdd / BASE4;
            quaternaryStr = String.format("%d%s", nextDigit, quaternaryStr);
        }
        if (negative) {
            quaternaryStr = String.format("-%s", quaternaryStr);
        }

        if (quaternaryStr.equals("")) {
            return 0;
        }
        return Integer.parseInt(quaternaryStr);
    }

    public int base4To10(int base4Number) {
        int multiplier;
        int base10total = 0;
        
        if (base4Number > 3333333){
            //got to look up the error code
            return 0;
        }
        // I know a more optimal way using a hashmap still figuring out the code for it.
        while(base4Number>0) {
            if (base4Number >= 1000000) {
                multiplier = base4Number / 1000000;
                base10total = base10total+(multiplier*4096);
                base4Number = base4Number - (1000000*multiplier);
            }else if (base4Number >= 100000) {
                multiplier = base4Number / 100000;
                base10total = base10total + (multiplier * 1024);
                base4Number = base4Number - (100000 * multiplier);
            }else if (base4Number >= 10000) {
                multiplier = base4Number / 10000;
                base10total = base10total + (multiplier * 256);
                base4Number = base4Number - (10000 * multiplier);
            }else if (base4Number >= 1000) {
                multiplier = base4Number / 1000;
                base10total = base10total + (multiplier * 64);
                base4Number = base4Number - (1000 * multiplier);
            }else if (base4Number >= 100) {
                multiplier = base4Number / 100;
                base10total = base10total + (multiplier * 16);
                base4Number = base4Number - (100 * multiplier);
            }else if (base4Number >= 10) {
                multiplier = base4Number / 10;
                base10total = base10total + (multiplier * 4);
                base4Number = base4Number - (10 * multiplier);
            }else{
                base10total =base10total+base4Number;
                base4Number -= base4Number;
            }
        }

        return base10total;
    }

    private boolean isNegative(int number) {
        return number < 0;
    }

}
