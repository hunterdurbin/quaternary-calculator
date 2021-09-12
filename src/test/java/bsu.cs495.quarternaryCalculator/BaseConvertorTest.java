package bsu.cs495.quarternaryCalculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseConvertorTest {

    @Test
    @DisplayName("Test base10To4 computes base10(0) => base4(0) correctly")
    void testBase10To4_1() {
        BaseConvertor convertor = new BaseConvertor();
        int actual = convertor.base10To4(0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test base10To4 computes base10(4) => base4(10) correctly")
    void testBase10To4_2() {
        BaseConvertor convertor = new BaseConvertor();
        int actual = convertor.base10To4(4);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test base10To4 computes base10(10) => base4(22) correctly")
    void testBase10To4_3() {
        BaseConvertor convertor = new BaseConvertor();
        int actual = convertor.base10To4(10);
        int expected = 22;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test base10To4 computes base10(283) => base4(10123) correctly")
    void testBase10To4_4() {
        BaseConvertor convertor = new BaseConvertor();
        int actual = convertor.base10To4(283);
        int expected = 10123;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test base10To4 computes base10(-4) => base4(-10) correctly")
    void testBase10To4_5_Negative() {
        BaseConvertor convertor = new BaseConvertor();
        int actual = convertor.base10To4(-4);
        int expected = -10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test base10To4 computes base10(16383) => base4(3333333) correctly")
    void testBase10To4_5_MaxValueNeeded() {
        BaseConvertor convertor = new BaseConvertor();
        int actual = convertor.base10To4(16383);
        int expected = 3333333;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testBase10To4_7_Many() {
        BaseConvertor convertor = new BaseConvertor();
        int[] base10Numbers = {0, 3, 4, 8, 11, 12, 58, 100, 16383, -16383, -153};
        int[] actual = new int[base10Numbers.length];
        for (int i = 0; i < base10Numbers.length; i++) {
            actual[i] = convertor.base10To4(base10Numbers[i]);
        }
        int[] expected = {0, 3, 10, 20, 23, 30, 322, 1210, 3333333, -3333333, -2121};
        Assertions.assertAll(
                () -> Assertions.assertEquals(expected[0], actual[0]),
                () -> Assertions.assertEquals(expected[1], actual[1]),
                () -> Assertions.assertEquals(expected[2], actual[2]),
                () -> Assertions.assertEquals(expected[3], actual[3]),
                () -> Assertions.assertEquals(expected[4], actual[4]),
                () -> Assertions.assertEquals(expected[5], actual[5]),
                () -> Assertions.assertEquals(expected[6], actual[6]),
                () -> Assertions.assertEquals(expected[7], actual[7]),
                () -> Assertions.assertEquals(expected[8], actual[8]),
                () -> Assertions.assertEquals(expected[9], actual[9]),
                () -> Assertions.assertEquals(expected[10], actual[10])
        );

    }
}
