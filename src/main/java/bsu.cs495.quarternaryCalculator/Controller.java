package bsu.cs495.quarternaryCalculator;

public class Controller {
    private Calculator calculator = new Calculator();
    private Operation operation;
    private int input;
    private int number1;
    private int number2;
    private int answer;
    private boolean isInput = false; // Only false after number1 is stored, but before any digit is entered for number2
    private boolean isNumber1 = false;
    private boolean isNumber2 = false;
    private boolean isAnswer = false;
    private int base = 4;

    public Controller() {
        this.operation = Operation.NONE;
        this.input = 0;
        this.number1 = 0;
        this.number2 = 0;
        this.answer = 0;
    }

    public void appendDigitToInput(int digit) {
        isInput = true;
        isAnswer = false;
        input = Integer.parseInt(String.format("%d%d", input, digit));
    }

    public void deleteRecentDigitInInput() {
        isInput = true;
        isAnswer = false;
        if (input == 0) {
            return;
        }

        String inputStr = String.valueOf(input);
        if (inputStr.length() == 1) {
            input = 0;
            return;
        }
        input = Integer.parseInt(inputStr.substring(0, inputStr.length()-1));
    }

    public void resetMemory() {
        operation = Operation.NONE;
        number1 = 0;
        number2 = 0;
        isNumber1 = false;
        isNumber2 = false;
        isInput = true;
        isAnswer = true;
    }

    public int getInput() {
        return input;
    }

    public int getAnswer() {
        if (base == 10) {
            BaseConvertor convertor = new BaseConvertor();
            return convertor.base4To10(answer);
        }
        return answer;
    }

    public String showAnswer() {
        return String.valueOf(getAnswer());
    }

    public String showInput() {
        return String.valueOf(getInput());
    }

    public String showAuto() {
        if (isAnswer) {
            return showAnswer();
        }
        return showInput();
    }

    public void changeBase(int base) {
        this.base = base;
    }

    private boolean storeInputToNumber1() {
        if (!isNumber1) {
            number1 = input;
            isNumber1 = true;
            return true;
        }
        return false;
    }

    private boolean storeInputToNumber2() {
        if (!isNumber2) {
            number2 = input;
            isNumber2 = true;
            return true;
        }
        return false;
    }

    private void clearInput() {
        input = 0;
        isInput = false;
    }

    public void startOperation(Operation operation) {
        resetMemory();
        storeInputToNumber1();
        clearInput();
        this.operation = operation;
        switch (operation) {
            case SQUARE -> {
                answer = calculator.square(number1);
                isNumber2 = true;
            }
            case SQUARE_ROOT -> {
                answer = calculator.squareRoot(number1);
                isNumber2 = true;
            }
            default -> answer = 0;
        }
        isAnswer = true;
    }

    public void equalsInitiate() {
        if (!isNumber1 || operation.equals(Operation.NONE)) {
            return;
        }
        storeInputToNumber2();
        switch (operation) {
            case ADD -> answer = calculator.sum(number1, number2);
            case SUBTRACT -> answer = calculator.subtraction(number1, number2);
            case MULTIPLY -> answer = calculator.multiplication(number1, number2);
            case DIVIDE -> answer = calculator.division(number1, number2);
            default -> answer = 0;
        }
        clearInput();
    }

    public String buildOperation() {
        if (operation.equals(Operation.SQUARE)) {
            return String.format("%d^2 =", number1);
        }
        if (operation.equals(Operation.SQUARE_ROOT)) {
            return String.format("sqrt(%d) =", number1);
        }

        if (!isNumber1 && !isNumber2 && isInput) {
            return String.format("%d", input);
        } else if (!isInput && !isNumber2) {
            return String.format("%d %s", number1, operation.label);
        } else if (!isNumber2) {
            return String.format("%d %s %d", number1, operation.label, input);
        }
        return String.format("%d %s %d =", number1, operation.label, number2);
    }

}
