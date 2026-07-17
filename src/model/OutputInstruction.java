package model;

import interpreter.Interpreter;

public class OutputInstruction implements Instruction{
    private String variable;

    public OutputInstruction(String variable) {
        this.variable = variable;
    }

    @Override
    public void execute(Interpreter interpreter) {
        System.out.println("AUSGABE: " + interpreter.getVariable(variable));
    }
}
