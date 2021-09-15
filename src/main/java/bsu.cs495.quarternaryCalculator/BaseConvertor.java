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
        int numberOfDigits = String.valueOf(base4Number).length();
        int rightmostDigit;
        int base10total = 0;

        for (int currentDigitPlace = 0;
                    currentDigitPlace < numberOfDigits; currentDigitPlace++) {
            rightmostDigit = base4Number % 10;
            base10total += rightmostDigit * Math.pow(BASE4, currentDigitPlace);
            base4Number /= 10;
        }
        return base10total;
    }

    private boolean isNegative(int number) {
        return number < 0;
    }
}
