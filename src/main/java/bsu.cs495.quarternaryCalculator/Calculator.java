package bsu.cs495.quarternaryCalculator;

public class Calculator {

    int multiplication(int number1, int number2){
        BaseConvertor b = new BaseConvertor();
        int input1 = b.base4To10(number1);
        int input2 = b.base4To10(number2);
        int result = (input1 + input2);
        return b.base10To4(result);
    }

    int sum(int number1, int number2){
        BaseConvertor b = new BaseConvertor();
        int input1 = b.base4To10(number1);
        int input2 = b.base4To10(number2);
        int result = (input1 + input2);
        return b.base10To4(result);
    }

    int subtraction(int number1, int number2){
        BaseConvertor b = new BaseConvertor();
        int input1 = b.base4To10(number1);
        int input2 = b.base4To10(number2);
        int result = (input1 - input2);
        return b.base10To4(result);
    }

    int division(int number1, int number2){
        BaseConvertor b = new BaseConvertor();
        int input1 = b.base4To10(number1);
        int input2 = b.base4To10(number2);
        int result = (input1 / input2);
        return b.base10To4(result);
    }

    int squareRoot(int number1) {
        BaseConvertor b = new BaseConvertor();
        int input = b.base4To10(number1);
        int result = (int) Math.sqrt(input);
        return b.base10To4(result);
    }

    int square(int number1){
        BaseConvertor b = new BaseConvertor();
        int input = b.base4To10(number1);
        int result = (int) Math.pow(input, 2);
        return b.base10To4(result);
    }
}
