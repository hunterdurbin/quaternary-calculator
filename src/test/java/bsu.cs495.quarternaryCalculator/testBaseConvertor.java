package bsu.cs495.quarternaryCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testBaseConvertor {

    @Test
    @DisplayName("Test base10(3) == base4(3)")
    void testBase10To4_1() {
        BaseConvertor convertor = new BaseConvertor();
        int actual = convertor.base10To4(3);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test base10(4) == base4(10)")
    void testBase10To4_2() {
        BaseConvertor convertor = new BaseConvertor();
        int actual = convertor.base10To4(4);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test base10(10) == base4(22)")
    void testBase10To4_3() {
        BaseConvertor convertor = new BaseConvertor();
        int actual = convertor.base10To4(10);
        int expected = 22;
        Assertions.assertEquals(expected, actual);
    }
}
