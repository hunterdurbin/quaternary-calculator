package bsu.cs495.quarternaryCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ControllerTest {

    @Test
    @DisplayName("Test that a digit gets input to the current input value")
//    @Disabled("Not Implemented yet")
    void testAppendDigitToInput_1() {
        Controller controller = new Controller();
        controller.appendDigitToInput(0);
        Assertions.assertEquals(0, controller.getInput());
    }

    @Test
    @DisplayName("Test that a digit gets input to the current input value")
//    @Disabled("Not Implemented yet")
    void testAppendDigitToInput_2() {
        Controller controller = new Controller();
        controller.appendDigitToInput(1);
        controller.appendDigitToInput(0);
        controller.appendDigitToInput(3);
        Assertions.assertEquals(103, controller.getInput());
    }

    @Test
    @DisplayName("Test that a digit gets input to the current input value")
//    @Disabled("Not Implemented yet")
    void testAppendDigitToInput_3() {
        Controller controller = new Controller();
        controller.appendDigitToInput(0);
        controller.appendDigitToInput(0);
        controller.appendDigitToInput(1);
        controller.appendDigitToInput(4);
        controller.appendDigitToInput(0);
        controller.appendDigitToInput(2);
        Assertions.assertEquals(1402, controller.getInput());
    }

    @Test
    void testGetInput() {
        Controller controller = new Controller();
        Assertions.assertEquals(0, controller.getInput());
    }

    @Test
//    @Disabled("Not implemented")
    void testDeleteRecentDigitInInput_1() {
        Controller controller = new Controller();
        controller.appendDigitToInput(412);
        controller.deleteRecentDigitInInput();
        Assertions.assertEquals(41, controller.getInput());
    }

    @Test
//    @Disabled("Not implemented")
    void testDeleteRecentDigitInInput_2() {
        Controller controller = new Controller();
        controller.appendDigitToInput(21242);
        controller.deleteRecentDigitInInput();
        controller.deleteRecentDigitInInput();
        controller.deleteRecentDigitInInput();
        Assertions.assertEquals(21, controller.getInput());
    }

    @Test
    @DisplayName("Make sure that input is 0 if too many deletes happen")
//    @Disabled("Not implemented")
    void testDeleteRecentDigitInInput_3() {
        Controller controller = new Controller();
        controller.appendDigitToInput(33);
        controller.deleteRecentDigitInInput();
        controller.deleteRecentDigitInInput();
        controller.deleteRecentDigitInInput();
        Assertions.assertEquals(0, controller.getInput());
    }

    @Test
    void testStartSquare_1() {
        Controller controller = new Controller();
        controller.appendDigitToInput(2);
        controller.startOperation(Operation.SQUARE);
        Assertions.assertEquals(10, controller.getAnswer(4));
    }

    @Test
    void testStartSqrt_1() {
        Controller controller = new Controller();
        controller.appendDigitToInput(10);
        controller.startOperation(Operation.SQUARE_ROOT);
        Assertions.assertEquals(2, controller.getAnswer(4));
    }

    @Test
//    @Disabled
    void testStartAddition_1() {
        Controller controller = new Controller();
        controller.appendDigitToInput(10);
        controller.startOperation(Operation.ADD);
        controller.appendDigitToInput(21);
        controller.equalsInitiate();
        Assertions.assertEquals(31, controller.getAnswer(4));
    }

    @Test
//    @Disabled
    void testStartSubtraction_1() {
        Controller controller = new Controller();
        controller.appendDigitToInput(213);
        controller.startOperation(Operation.SUBTRACT);
        controller.appendDigitToInput(103);
        controller.equalsInitiate();
        Assertions.assertEquals(110, controller.getAnswer(4));
    }

    @Test
//    @Disabled
    void testStartMultiplication_1() {
        Controller controller = new Controller();
        controller.appendDigitToInput(10);
        controller.startOperation(Operation.MULTIPLY);
        controller.appendDigitToInput(2);
        controller.equalsInitiate();
        Assertions.assertEquals(20, controller.getAnswer(4));
    }

    @Test
//    @Disabled
    void testStartDivision_1() {
        Controller controller = new Controller();
        controller.appendDigitToInput(10);
        controller.startOperation(Operation.DIVIDE);
        controller.appendDigitToInput(2);
        controller.equalsInitiate();
        Assertions.assertEquals(2, controller.getAnswer(4));
    }

    @Test
    @DisplayName("There is an input, but no numbers set in memory")
//    @Disabled
    void testBuildOperation_1() {
        Controller controller = new Controller();
        controller.appendDigitToInput(31);
        Assertions.assertEquals("31", controller.buildOperation());
    }

    @Test
    @DisplayName("There is input, but no numbers set in memory")
//    @Disabled
    void testBuildOperation_2() {
        Controller controller = new Controller();
        controller.appendDigitToInput(10);
        Assertions.assertEquals("10", controller.buildOperation());
    }

    @Test
    @DisplayName("There is 1 number, no 2nd number, and no input")
//    @Disabled
    void testBuildOperation_3() {
        Controller controller = new Controller();
        controller.appendDigitToInput(11);
        controller.startOperation(Operation.MULTIPLY);
        Assertions.assertEquals("11 X", controller.buildOperation());
    }

    @Test
    @DisplayName("There is 1 number, and 2nd number, and equals has been pressed")
//    @Disabled
    void testBuildOperation_4() {
        Controller controller = new Controller();
        controller.appendDigitToInput(10);
        controller.startOperation(Operation.ADD);
        controller.appendDigitToInput(3);
        controller.equalsInitiate();
        Assertions.assertEquals("10 + 3 =", controller.buildOperation());
    }

    @Test
    @DisplayName("There is 1 number, is input, no 2nd number")
//    @Disabled
    void testBuildOperation_5() {
        Controller controller = new Controller();
        controller.appendDigitToInput(11);
        controller.startOperation(Operation.MULTIPLY);
        controller.appendDigitToInput(2);
        Assertions.assertEquals("11 X 2", controller.buildOperation());
    }
}





























