package model;

import interpreter.Interpreter;

public class InputInstruction implements Instruction{
    private String variable;

    public InputInstruction(String variable) {
        this.variable = variable;
    }

    @Override
    public void execute(Interpreter interpreter) {
        interpreter.readInput(variable);
    }
}
