package bsu.cs495.quarternaryCalculator;

public class Controller {
    private Calculator calculator = new Calculator();
    private Operation operation = Operation.NONE;
    private int input;
    private int number1;
    private int number2;
    private int answer;
    private boolean isInput = false;
    private boolean isNumber1 = false;
    private boolean isNumber2 = false;

    public Controller() {
        this.operation = Operation.NONE;
        this.input = 0;
        this.number1 = 0;
        this.number2 = 0;
        this.answer = 0;
    }

    public void appendDigitToInput(int digit) {
    }

    public String getInput() {
        return String.valueOf(input);
    }
}
