package model;

import interpreter.Interpreter;

public class AdditionInstruction implements Instruction{
    private String target;
    private String leftAddend;
    private String rightAddend;

    public AdditionInstruction(String target, String leftAddend, String rightAddend) {
        this.target = target;
        this.leftAddend = leftAddend;
        this.rightAddend = rightAddend;
    }

    @Override
    public void execute(Interpreter interpreter) {
        int result = interpreter.getVariable(leftAddend) + interpreter.getVariable(rightAddend);
        AssignmentInstruction assignmentInstruction = new AssignmentInstruction(target, result);
        interpreter.assign(assignmentInstruction);
    }
}
