package homework11.services;

import homework11.Application.Pet;
import homework11.Application.Family;
import homework11.Application.Human;
import homework11.dao.FamilyDAO;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class FamilyService extends FamilyDAO {

    @Override
    public List<Family> getAll() {
        return super.getAll();
    }

    public void displayAllFamilies (){
        System.out.println(getFamilies());
    }


    public void getFamiliesBiggerThan (int desired) {
        for (int i=0; i<getFamilies().size(); i++ ) {
            if (Family.countFamily(getFamilies().get(i)) > desired) {
                System.out.println(getFamilies().get(i));
            }
        }
    }

    public void getFamiliesLessThan (int desired) {
        for (int i=0; i<getFamilies().size(); i++ ) {
            if (Family.countFamily(getFamilies().get(i)) < desired) {
                System.out.println(getFamilies().get(i));
            }
        }
    }

    public void createNewFamily (Human father, Human mother) {
        getFamilies().add(new Family(father, mother));
    }


    public void deleteFamilyByIndex (int id) {
        getFamilies().remove(id);
    }

    public Family bornChild (Family family, String gender) {
        String surname = family.getFather().getSurname();
        LocalDate birthDate = LocalDate.of(2005, 5, 17);
        LocalDate birthDate1 = LocalDate.of(2010, 5, 17);

        if (gender == "masculine") {
            Human jack = new Human("Jack",surname , birthDate);
            family.addChild(jack);
        } else {
            Human jessy = new Human("Jessy", surname, birthDate1);
            family.addChild(jessy);
        }
        return family;
    }


    public Family adoptChild (Family family, Human child) {

        family.addChild(child);

        return family;
    }


    public int count () {
        return getFamilies().size();
    }

    public Family getFamilyById (int id) {
        return getFamilies().get((int) id);
    }

    public Set<Pet> getPets (int id) {
        return getFamilies().get(id).getPet();
    }

    public void addPet (int id, Pet pet) {
        getFamilies().get(id).getPet().add(pet);
    }
}

