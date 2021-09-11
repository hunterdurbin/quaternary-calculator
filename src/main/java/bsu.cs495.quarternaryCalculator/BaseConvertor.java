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
        return 0;
    }

    private boolean isNegative(int number) {
        return number < 0;
    }

}
