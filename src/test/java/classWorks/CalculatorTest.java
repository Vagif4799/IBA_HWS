package classWorks;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator test = new Calculator();

    @Test
    public void add() {
        int addition = test.add(5, 5);
        assertEquals(10, addition);
    }

    @Test
    public void sub() {
        int subsitution = test.sub(5, 5);
        assertEquals(0, subsitution);
    }

    @Test
    public void mul() {
        int multiplaction = test.mul(5,5);
        assertEquals(25, multiplaction);
    }

    @Test
    public void div() {
        int division = test.div(5, 5);
        assertEquals(1, division);
    }
}