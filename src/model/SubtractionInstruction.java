package model;

import interpreter.Interpreter;

public class SubtractionInstruction implements Instruction{
    private String target;
    private String minuend;
    private String subtrahend;

    public SubtractionInstruction(String target, String minuend, String subtrahend) {
        this.target = target;
        this.minuend = minuend;
        this.subtrahend = subtrahend;
    }

    @Override
    public void execute(Interpreter interpreter) {
        int result = interpreter.getVariable(minuend) - interpreter.getVariable(subtrahend);
        AssignmentInstruction assignmentInstruction = new AssignmentInstruction(target, result);
        interpreter.assign(assignmentInstruction);
    }
}
