package assign2;

import assign2.Assign2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Len Payne
 */
public class Assign2Test {

    // Streams used to hijack System.out and System.err
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    public Assign2Test() {
    }

    @Before
    public void setUp() {
        // Hijacking the Out and Err Streams
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() {
        // Resetting the Out and Err Streams
        System.setOut(null);
        System.setErr(null);
    }

    /**
     * Test of doExercise1 method, of class Assign2.
     */
    @Test
    public void testDoExercise1() {
        String[] expected
                = {"*", 
                   "* *", 
                   "* * *", 
                   "* * * *", 
                   "* * * * *", 
                   "* * * * * *", 
                   "* * * * * * *"};

        Assign2.doExercise1();
        String[] actual = outContent.toString().split("\n");

        if (actual.length <= 1) {
            fail("No Output");
        } else {
            for (int i = 0; i < expected.length; i++) {
                assertEquals("Testing if '" + actual[i] + "' equals '" + expected[i] + "'",
                        expected[i], actual[i].trim());
            }
        }
    }

    /**
     * Test of doExercise2 method, of class Assign2.
     */
    @Test
    public void testDoExercise2() {
        String fakeInput = "600\n8\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        String expected = "75";

        System.setIn(new ByteArrayInputStream(fakeInputArray));
        Assign2.doExercise2();
        String actual = outContent.toString();

        assertTrue("Testing if '" + actual + "' contains '" + expected + "'",
                actual.contains(expected));
        System.setIn(null);
    }

    /**
     * Test of doExercise3 method, of class Assign2.
     */
    @Test
    public void testDoExercise3() {
        String fakeInput = "62\n71\n85\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        String[] expected
                = {"62", "71", "85", "72.6"};

        System.setIn(new ByteArrayInputStream(fakeInputArray));
        Assign2.doExercise3();
        String actual = outContent.toString();

        for (int i = 0; i < expected.length; i++) {
            assertTrue("Testing if '" + actual + "' contains '" + expected[i] + "'",
                    actual.contains(expected[i]));
        }

        System.setIn(null);
    }

    /**
     * Test of doExercise4 method, of class Assign2.
     */
    @Test
    public void testDoExercise4() {
        String fakeInput = "Buffalo";
        byte[] fakeInputArray = fakeInput.getBytes();
        String[] expected
                = {"7", "BUFFALO", "buffalo", "B"};

        System.setIn(new ByteArrayInputStream(fakeInputArray));
        Assign2.doExercise4();
        String[] actual = outContent.toString().split("\n");

        if (actual.length <= 1) {
            fail("No Output");
        } else {
            for (int i = 0; i < expected.length; i++) {
                assertTrue("Testing if '" + actual[i + 1] + "' contains '" + expected[i] + "'",
                        actual[i + 1].contains(expected[i]));
            }
        }
        System.setIn(null);
    }

    /**
     * Test of doExercise5 method, of class Assign2.
     */
    @Test
    public void testDoExercise5() {
        String fakeInput = "Bob\nTuesday\nSarnia\nLambton College\nProgrammer\nCamry\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        String expected
                = "Once upon a time, Bob travelled to Sarnia on a Tuesday. They "
                + "were going to Lambton College for an interview as a Programmer. "
                + "Bob drove there in a Camry. They got the job!";

        System.setIn(new ByteArrayInputStream(fakeInputArray));
        Assign2.doExercise5();
        String actual = outContent.toString();

        assertTrue("Testing if '" + actual + "' matches '" + expected + "'",
                actual.contains(expected));

        System.setIn(null);
    }

}
