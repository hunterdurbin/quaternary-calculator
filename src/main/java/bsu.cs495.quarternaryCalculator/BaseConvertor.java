package bsu.cs495.quarternaryCalculator;

public class BaseConvertor {

    public int base10To4(int base10Number) {
        return 0;
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
            if (base4Number > 1000000) {
                multiplier = base4Number / 1000000;
                base10total = base10total+(multiplier*4096);
                base4Number = base4Number - (1000000*multiplier);
            }else if (base4Number > 100000) {
                multiplier = base4Number / 100000;
                base10total = base10total + (multiplier * 1024);
                base4Number = base4Number - (100000 * multiplier);
            }else if (base4Number > 10000) {
                multiplier = base4Number / 10000;
                base10total = base10total + (multiplier * 256);
                base4Number = base4Number - (10000 * multiplier);
            }else if (base4Number > 1000) {
                multiplier = base4Number / 1000;
                base10total = base10total + (multiplier * 64);
                base4Number = base4Number - (1000 * multiplier);
            }else if (base4Number > 100) {
                multiplier = base4Number / 100;
                base10total = base10total + (multiplier * 16);
                base4Number = base4Number - (100 * multiplier);
            }else if (base4Number > 10) {
                multiplier = base4Number / 10;
                base10total = base10total + (multiplier * 4);
                base4Number = base4Number - (100000 * multiplier);
            }else{
                base10total =base10total+base4Number;
            }
        }

        return base10total;
    }

}
