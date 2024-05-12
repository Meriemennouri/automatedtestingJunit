import demo.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void addtwoNumbers() {
        assertEquals(4, calc.add(2, 2));
    }
    
    @Test
    public void addtreeNumbers() {
        assertEquals(6, calc.add(2, 2, 2));
    }
    @Test
    public void subtwoNumbers() {
        assertEquals(2, calc.substract(4, 2));
    }
    @Test
    public void subTreeNumbers() {
        assertEquals(2, calc.substract(6, 2, 2));
    }

    
}
