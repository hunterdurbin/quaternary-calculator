package bsu.cs495.quarternaryCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest
{
    @Test
    void testMultiplication(){
        Calculator calc = new Calculator();
        int actual = calc.multiplication(2, 2);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSum(){
        Calculator calc = new Calculator();
        int actual = calc.sum(11, 12);
        int expected = 23;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSubtraction(){
        Calculator calc = new Calculator();
        int actual = calc.subtraction(3, 3);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDivision(){
        Calculator calc = new Calculator();
        int actual = calc.division(10, 2);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSquareRoot(){
        Calculator calc = new Calculator();
        int actual = calc.squareRoot(21);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSquare(){
        Calculator calc = new Calculator();
        int actual = calc.square(2);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }
}
