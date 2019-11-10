package Pharanteses;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PharantesesTest {

    public Pharanteses app;

    @Before
    public void before() {
        app = new Pharanteses();
    }

    @Test
    public void calculator() {
        assertEquals(1, app.calculator("()()()()"));
    }

    @Test
    public void calculator1() {
        assertEquals(2, app.calculator("(()()()()())"));
    }

    @Test
    public void calculator2() {
        assertEquals(3, app.calculator("((()()()()())"));
    }
}