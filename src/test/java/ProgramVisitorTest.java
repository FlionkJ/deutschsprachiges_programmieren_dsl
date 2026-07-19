import interpreter.ProgramLine;
import model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;


public class ProgramVisitorTest {

    @Test
    public void visitorTest() {
        java.util.List<ProgramLine> programLines = TestUtil.getLinesFromProgramFile("src/test/resources/testVisitorProgramm.txt");

        assertInstanceOf(AssignmentInstruction.class, programLines.get(0).getInstruction());
        assertEquals( 0, programLines.get(0).getLineNumber());
        AssignmentInstruction assignint = (AssignmentInstruction) programLines.get(0).getInstruction();
        assertEquals("R", assignint.getVariable());
        assertEquals(0, assignint.getValue());

        assertInstanceOf(ConditionalJumpInstruction.class, programLines.get(2).getInstruction());
        assertInstanceOf(AdditionInstruction.class, programLines.get(3).getInstruction());
        assertInstanceOf(SubtractionInstruction.class, programLines.get(4).getInstruction());
        assertInstanceOf(UnconditionalJumpInstruction.class, programLines.get(5).getInstruction());
        assertInstanceOf(OutputInstruction.class, programLines.get(6).getInstruction());
        assertInstanceOf(StopInstruction.class, programLines.get(7).getInstruction());
    }
}
