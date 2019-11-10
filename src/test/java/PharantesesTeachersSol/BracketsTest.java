package PharantesesTeachersSol;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsTest {

    public Brackets app;

    @Before
    public void setUp() throws Exception {
        app = new Brackets();
    }

    @Test
    public void calc1() {
        assertEquals(1, app.calc("()()()()"));
    }

    @Test
    public void calc2() {
        assertEquals(2, app.calc("(()()()()())"));
    }

    @Test
    public void calc3() {
        assertEquals(3, app.calc("((()()()()())"));
    }
}