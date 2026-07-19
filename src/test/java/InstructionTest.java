import interpreter.Interpreter;
import interpreter.ProgramLine;
import model.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class InstructionTest {

    @Test
    public void StopTest() {
        List< ProgramLine> programm = new ArrayList<>();
        programm.add(new ProgramLine(0,new StopInstruction()));
        Interpreter interpreter = new Interpreter(programm);
        interpreter.execute();
        assertFalse(interpreter.getRunning());
        assertEquals(1, interpreter.getProgramCounter());

    }

    @Test
    public void AssignmentTest() {
        List< ProgramLine> programm = new ArrayList<>();
        programm.add(new ProgramLine(0,new AssignmentInstruction("X", 10)));
        programm.add(new ProgramLine(0,new AssignmentInstruction("X", 20)));
        Interpreter interpreter = new Interpreter(programm);
        interpreter.execute();
        interpreter.stop();;

        assertEquals(20, interpreter.getVariable("X"));

    }

    @Test
    public void AdditionTest() {
        List< ProgramLine> programm = new ArrayList<>();
        programm.add(new ProgramLine(0,new AssignmentInstruction("X", -10)));
        programm.add(new ProgramLine(0,new AssignmentInstruction("Y", -20)));
        programm.add(new ProgramLine(0, new AdditionInstruction("Z", "X", "Y")));
        Interpreter interpreter = new Interpreter(programm);
        interpreter.execute();
        interpreter.stop();;
        assertEquals(-30,interpreter.getVariable("Z"));

    }

    @Test
    public void SubstractionTest() {
        List< ProgramLine> programm = new ArrayList<>();
        programm.add(new ProgramLine(0,new AssignmentInstruction("X", 10)));
        programm.add(new ProgramLine(0,new AssignmentInstruction("Y", -20)));
        programm.add(new ProgramLine(0, new SubtractionInstruction("Z", "X", "Y")));
        Interpreter interpreter = new Interpreter(programm);
        interpreter.execute();
        interpreter.stop();;
        assertEquals(30,interpreter.getVariable("Z"));

    }

    @Test
    public void JumpTest(){
        List< ProgramLine> programm = new ArrayList<>();
        programm.add(new ProgramLine(0,new AssignmentInstruction("X", 10)));
        programm.add(new ProgramLine(0,new AssignmentInstruction("Y", 20)));
        programm.add(new ProgramLine(0, new ConditionalJumpInstruction("Y", "=", 60, 5)));
        programm.add(new ProgramLine(0, new AdditionInstruction("Y", "X", "Y")));
        programm.add(new ProgramLine(0, new UnconditionalJumpInstruction(2)));
        programm.add(new ProgramLine(0, new StopInstruction()));
        Interpreter interpreter = new Interpreter(programm);
        interpreter.execute();
        assertEquals(6, interpreter.getProgramCounter());
        assertEquals(60, interpreter.getVariable("Y"));


    }


}