package bsu.cs495.quarternaryCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest
{
    @Test
    void testMultiplication_1(){
        Calculator calc = new Calculator();
        int actual = calc.multiplication(2, 2);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMultiplication_2(){
        Calculator calc = new Calculator();
        int actual = calc.multiplication(11, 2);
        int expected = 22;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSum_1(){
        Calculator calc = new Calculator();
        int actual = calc.sum(11, 12);
        int expected = 23;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSum_2(){
        Calculator calc = new Calculator();
        int actual = calc.sum(1, 1);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSubtraction_1(){
        Calculator calc = new Calculator();
        int actual = calc.subtraction(3, 3);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSubtraction_2(){
        Calculator calc = new Calculator();
        int actual = calc.subtraction(31, 2);
        int expected = 23;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDivision_1(){
        Calculator calc = new Calculator();
        int actual = calc.division(10, 2);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDivision_2(){
        Calculator calc = new Calculator();
        int actual = calc.division(20, 2);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSquareRoot_1(){
        Calculator calc = new Calculator();
        int actual = calc.squareRoot(21);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSquareRoot_2(){
        Calculator calc = new Calculator();
        int actual = calc.squareRoot(10);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSquare_1(){
        Calculator calc = new Calculator();
        int actual = calc.square(2);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSquare_2(){
        Calculator calc = new Calculator();
        int actual = calc.square(10);
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }
}
