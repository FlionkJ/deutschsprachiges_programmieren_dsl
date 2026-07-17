package model;

import interpreter.Interpreter;

public class UnconditionalJumpInstruction implements Instruction{
    private int lineNumber;

    public UnconditionalJumpInstruction(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public void execute(Interpreter interpreter) {
        interpreter.setProgramCounter(lineNumber);
    }
}
