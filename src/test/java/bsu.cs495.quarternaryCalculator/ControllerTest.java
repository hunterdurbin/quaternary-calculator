package bsu.cs495.quarternaryCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ControllerTest {

    @Test
    @DisplayName("Test that a digit gets input to the current input value")
    @Disabled("Not Implemented yet")
    void testAppendDigitToInput_1() {
        Controller controller = new Controller();
        controller.appendDigitToInput(0);
        Assertions.assertEquals("0", controller.getInput());
    }

    @Test
    @DisplayName("Test that a digit gets input to the current input value")
    @Disabled("Not Implemented yet")
    void testAppendDigitToInput_2() {
        Controller controller = new Controller();
        controller.appendDigitToInput(1);
        controller.appendDigitToInput(0);
        controller.appendDigitToInput(3);
        Assertions.assertEquals("103", controller.getInput());
    }

    @Test
    @DisplayName("Test that a digit gets input to the current input value")
    @Disabled("Not Implemented yet")
    void testAppendDigitToInput_3() {
        Controller controller = new Controller();
        controller.appendDigitToInput(0);
        controller.appendDigitToInput(0);
        controller.appendDigitToInput(1);
        controller.appendDigitToInput(4);
        controller.appendDigitToInput(0);
        controller.appendDigitToInput(2);
        Assertions.assertEquals("1402", controller.getInput());
    }

    @Test
    void testGetInput() {
        Controller controller = new Controller();
        Assertions.assertEquals("0", controller.getInput());
    }

    @Test
    void testStoreInput() {
    }

    @Test
    @Disabled
    void testStartAddition_1() {
        Assertions.fail();
    }

    @Test
    @Disabled
    void testStartSubtraction_1() {
        Assertions.fail();
    }

    @Test
    @Disabled
    void testStartMultiplication_1() {
        Assertions.fail();
    }

    @Test
    @Disabled
    void testStartDivision_1() {
        Assertions.fail();
    }

    @Test
    @DisplayName("There is an input, but no numbers set in memory")
    @Disabled
    void testBuildOperation_1() {

    }

    @Test
    @DisplayName("There is 1 number, no input, no 2nd number")
    @Disabled
    void testBuildOperation_2() {

    }

    @Test
    @DisplayName("There is 1 number, is input, no 2nd number")
    @Disabled
    void testBuildOperation_3() {

    }

    @Test
    @DisplayName("There is 1 number, and 2nd number")
    @Disabled
    void testBuildOperation_4() {

    }
}





























