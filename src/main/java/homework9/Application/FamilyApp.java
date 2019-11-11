package homework9.Application;


import homework9.Controllers.FamilyController;
import homework9.dao.DAO;
import homework9.dao.FamilyDAO;

import java.util.*;

public class FamilyApp {

    private static DAO familyDao;

    public static void main(String[] args) {



        familyDao = new FamilyDAO();
        FamilyController familyController = new FamilyController();
//
//        Family family1 = getFamily(1);
//        System.out.println(family1);
//        familyDao.save(new Family());
//        System.out.println(familyDao.getAll());
//        familyDao.deleteById(1);
//        System.out.println(familyDao.getAll());



        Human angeline = new Human("Angel", "July", 1974);
        Human brad = new Human("Brad", "Pit", 1964);
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