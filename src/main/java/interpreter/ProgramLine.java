package interpreter;

import model.Instruction;

/**
 * Represents a single program line consisting of a line number and
 * the instruction assigned to that line.
 */
public class ProgramLine {
    private final int lineNumber;
    private final Instruction instruction;

    public ProgramLine(int lineNumber, Instruction instruction) {
        this.lineNumber = lineNumber;
        this.instruction = instruction;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public Instruction getInstruction() {
        return instruction;
    }

}
