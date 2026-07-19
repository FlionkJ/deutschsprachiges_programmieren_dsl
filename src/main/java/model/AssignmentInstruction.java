package model;

import interpreter.Interpreter;

public class AssignmentInstruction implements Instruction{
    private String variable;
    private int value;

    public AssignmentInstruction(String variable, int value) {
        this.variable = variable;
        this.value = value;
    }

    public String getVariable() {
        return variable;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void execute(Interpreter interpreter) {
        interpreter.assign(this);
    }
}
