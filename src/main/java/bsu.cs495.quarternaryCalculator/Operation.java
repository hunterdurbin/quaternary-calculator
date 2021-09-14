package bsu.cs495.quarternaryCalculator;

public enum Operation {
    NONE(""),
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("X"),
    DIVIDE("/"),
    SQUARE("sqaured"),
    SQUARE_ROOT("sqrt");

    public final String label;

    Operation(String label) {
        this.label = label;
    }

}
