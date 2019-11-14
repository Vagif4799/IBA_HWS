package homework11.Application;


import homework11.Controllers.FamilyController;
import homework11.dao.DAO;
import homework11.dao.FamilyDAO;

import java.time.LocalDate;
import java.util.Optional;

public class FamilyApp {

    private static DAO familyDao;

    public static void main(String[] args) {

        familyDao = new FamilyDAO();
        FamilyController familyController = new FamilyController();

//        Family family1 = getFamily(1);
//        System.out.println(family1);
//        familyDao.save(new Family());
//        System.out.println(familyDao.getAll());
//        familyDao.deleteById(1);
//        System.out.println(familyDao.getAll());

        LocalDate birthDate = LocalDate.of(1961, 5, 17);
        LocalDate birthDate1 = LocalDate.of(1971, 5, 17);


        Human angeline = new Human("Angel", "July", birthDate);
        Human brad = new Human("Brad", "Pit", birthDate1);
        familyController.displayAllFamilies();
        familyController.deleteFamilyByIndex(1);
        familyController.displayAllFamilies();
        System.out.println(familyController.count());
        familyController.createNewFamily(brad, angeline);
        System.out.println(familyController.count());
        System.out.println(familyController.getAll());



    }

    private static Family getFamily (long id) {
        Optional<Family> family = familyDao.get(id);

        return family.orElseGet(
                () -> new Family()
        );

    }

}