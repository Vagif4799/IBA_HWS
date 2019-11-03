package homework8;

import org.junit.Test;

import static org.junit.Assert.*;

public class FamilyTest {

    @Test
    public void addChild() {
        Family family = new Family();
        Human jon = new Human("Jon", "jonny", 2000);
        family.addChild(jon);
        boolean actual = false;
        if (family.getChildren().contains(jon)) {
            actual = true;
        }
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void deleteChild() {
        Family family = new Family();
        Human jon = new Human("Jon", "jonny", 2000);
        family.addChild(jon);
        family.deleteChild(0);
        boolean actual = true;
        if (family.getChildren().contains(jon)) {
            actual = false;
        }
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void countFamily() {
        Family family = new Family();
        Human brad = new Human("Brad", "Pit", 1964);
        Human angeline = new Human("Angel", "July", 1974);
        Human jon = new Human("Jon", "jonny", 2000);
        family.setFather(brad);
        family.setMother(angeline);
        family.addChild(jon);
        int actual = family.countFamily(family);
        int expected = 3;
        assertEquals(expected, actual);
    }
}