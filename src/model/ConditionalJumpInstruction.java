package model;

import interpreter.Interpreter;

public class ConditionalJumpInstruction implements Instruction {
    private String variable;
    private String operator;
    private int value;
    private int lineNumber;

    public ConditionalJumpInstruction(String variable, String operator, int value, int lineNumber) {
        this.variable = variable;
        this.operator = operator; // <-- NEU
        this.value = value;
        this.lineNumber = lineNumber;
    }

    @Override
    public void execute(Interpreter interpreter) {
        int varValue = interpreter.getVariable(variable);
        boolean conditionMet = false;

        switch (operator) {
            case "=":
                conditionMet = (varValue == value);
                break;
            case "<":
                conditionMet = (varValue < value);
                break;
            case ">":
                conditionMet = (varValue > value);
                break;
            default:
                throw new IllegalArgumentException("Unbekannter Operator: " + operator);
        }

        if (conditionMet) {
            interpreter.setProgramCounter(lineNumber);
        }
    }
}
