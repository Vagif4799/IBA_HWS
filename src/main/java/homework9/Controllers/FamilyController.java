package homework9.Controllers;

import homework9.Application.Family;
import homework9.Application.Human;
import homework9.Application.Pet;
import homework9.services.FamilyService;

import java.util.List;
import java.util.Set;

public class FamilyController extends FamilyService {
    private final FamilyService familyService;

    public FamilyController() {
        this.familyService = new FamilyService();
    }

    @Override
    public List<Family> getAll() {
        return super.getAll();
    }

    @Override
    public void displayAllFamilies() {
        super.displayAllFamilies();
    }

    @Override
    public void getFamiliesBiggerThan(int desired) {
        super.getFamiliesBiggerThan(desired);
    }

    @Override
    public void getFamiliesLessThan(int desired) {
        super.getFamiliesLessThan(desired);
    }

    @Override
    public void createNewFamily(Human father, Human mother) {
        super.createNewFamily(father, mother);
    }

    @Override
    public void deleteFamilyByIndex(int id) {
        super.deleteFamilyByIndex(id);
    }

    @Override
    public Family bornChild(Family family, String gender) {
        return super.bornChild(family, gender);
    }

    @Override
    public Family adoptChild(Family family, Human child) {
        return super.adoptChild(family, child);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public Family getFamilyById(int id) {
        return super.getFamilyById(id);
    }

    @Override
    public Set<Pet> getPets(int id) {
        return super.getPets(id);
    }

    @Override
    public void addPet(int id, Pet pet) {
        super.addPet(id, pet);
    }
}
