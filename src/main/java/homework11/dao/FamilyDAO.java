package homework11.dao;

import homework11.Application.Family;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FamilyDAO implements DAO<Family> {

    private List<Family> families = new ArrayList<>();

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }


    public FamilyDAO() {
        families.add(new Family());
        families.add(new Family());

    }

    @Override
    public List<Family> getAll() {
        return families;
    }

    @Override
    public Optional<Family> get(long id) {
        return Optional.ofNullable(families.get((int) id));
    }

    @Override
    public boolean deleteById(long id) {
        families.remove((int) id);
        return true;
    }

    @Override
    public boolean deletebyFamily(Family family) {
        families.remove(family);
        return true;
    }

    @Override
    public void save(Family family) {
        families.add(family);
    }
}
