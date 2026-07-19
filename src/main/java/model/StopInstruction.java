package model;

import interpreter.Interpreter;

public class StopInstruction implements Instruction{

    public StopInstruction() {
    }

    @Override
    public void execute(Interpreter interpreter) {
        interpreter.stop();
    }
}
