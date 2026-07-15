package model;

import interpreter.Interpreter;

public interface Instruction {
    void execute(Interpreter interpreter);
}
