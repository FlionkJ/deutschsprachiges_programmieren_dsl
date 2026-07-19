package interpreter;

import model.AssignmentInstruction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Executes the parsed DSL program by interpreting the stored program lines
 * and maintaining the current program state.
 */
public class Interpreter {
    private List<ProgramLine> programLines;
    private Map<String, Integer> variables = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);

    private int programCounter = 0;
    private boolean running = true;

    public Interpreter(List<ProgramLine> programLines) {
        this.programLines = programLines;
    }

    public void setProgramCounter(int programCounter) {
        this.programCounter = programCounter;
    }

    public void execute() {
        while (running && programCounter < programLines.size()) {
            ProgramLine programLine = programLines.get(programCounter);
            programCounter++;
            programLine.getInstruction().execute(this);
        }
    }

    public int getVariable(String variable) {
        return variables.get(variable);
    }

    public void assign(AssignmentInstruction assignmentInstruction) {
        if (variables.containsKey(assignmentInstruction.getVariable())) {
            variables.replace(assignmentInstruction.getVariable(), assignmentInstruction.getValue());
        } else {
            variables.put(assignmentInstruction.getVariable(), assignmentInstruction.getValue());
        }
    }

    public void stop() {
        running = false;
    }


    public void readInput(String variable) {
        System.out.println("Enter value for " + variable + ": ");
        AssignmentInstruction assignmentInstruction = new AssignmentInstruction(variable, scanner.nextInt());
        assign(assignmentInstruction);
    }

    public boolean getRunning(){
        return this.running;
    }

    public int getProgramCounter() {
        return this.programCounter;
    }

}
