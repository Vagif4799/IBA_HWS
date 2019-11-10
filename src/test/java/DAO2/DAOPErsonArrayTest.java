package DAO2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DAOPErsonArrayTest {

    DAOPErsonArray app;

    @Before
    public void before () {
        app = new DAOPErsonArray();
    }

    @Test
    public void put() {
        Person ps = new Person(1, "Ulvi", 20);
        app.put(ps);
        Person expected = ps;
    }

    @Test
    public void get() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {
    }
}