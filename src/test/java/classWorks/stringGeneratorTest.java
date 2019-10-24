package classWorks;

import org.junit.Test;

import static org.junit.Assert.*;

public class stringGeneratorTest {

    @Test
    public void randomWord() {
        stringGenerator t = new stringGenerator();
        String generated = t.randomWord(10);
        assertEquals(10, generated.length());
    }
}