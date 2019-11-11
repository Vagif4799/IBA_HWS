package homework9.services;

import homework9.Application.Family;
import homework9.Application.Human;
import homework9.Controllers.FamilyController;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FamilyServiceTest {



    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAll() {
        FamilyController familyController = new FamilyController();
        assertEquals(2, familyController.getAll().size());
    }

    @Test
    public void displayAllFamilies() {
        FamilyController familyController = new FamilyController();
        familyController.displayAllFamilies();
    }

    @Test
    public void getFamiliesBiggerThan() {
    }

    @Test
    public void getFamiliesLessThan() {
    }

    @Test
    public void createNewFamily() {
    }

    @Test
    public void deleteFamilyByIndex() {
    }

    @Test
    public void bornChild() {
    }

    @Test
    public void adoptChild() {
    }

    @Test
    public void count() {
    }

    @Test
    public void getFamilyById() {
    }

    @Test
    public void getPets() {
    }

    @Test
    public void addPet() {
    }
}