package model;

import interpreter.Interpreter;

public class ConditionalJumpInstruction implements Instruction{
    private String variable;
    private int value;
    private int lineNumber;

    public ConditionalJumpInstruction(String variable, int value, int lineNumber) {
        this.variable = variable;
        this.value = value;
        this.lineNumber = lineNumber;
    }

    @Override
    public void execute(Interpreter interpreter) {
        if (interpreter.getVariable(variable) == value) {
            interpreter.setProgramCounter(lineNumber);
        }
    }
}
