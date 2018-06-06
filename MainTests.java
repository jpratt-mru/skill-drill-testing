// Here is where you will add the test cases used to validate the solution.
// The number and style of the test cases can significantly change how well you can evaluate your candidate's solution.
// Click [VALIDATE TEST CASES] above to see the output from running against these tests.
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 


public class MainTests {
  private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
 
    private String asString() {
      return outContent.toString();
    }
  
    @Before
    public void setUpStreams() {
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }
 
    @After
    public void revertStreams() {
        System.setOut(sysOut);
    }
  
  
	@Test
	public void saysHello() {
      ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
      System.setIn(in);
      Main.stars();
      assertEquals("*", asString());
	}

}
