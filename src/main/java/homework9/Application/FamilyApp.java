package homework9.Application;


import homework9.Controllers.FamilyController;
import homework9.dao.DAO;
import homework9.dao.FamilyDAO;

import java.util.*;

public class FamilyApp {

    private static DAO familyDao;

    public static void main(String[] args) {

//
//        /*
//        {
//                {DayOfWeek.MONDAY.name(), "Go"},
//                {DayOfWeek.TUESDAY.name(), "Read"},
//                {DayOfWeek.WEDNESDAY.name(), "Walk"},
//                {DayOfWeek.THURSDAY.name(), "Study"},
//                {DayOfWeek.FRIDAY.name(), "Listen"},
//                {DayOfWeek.SATURDAY.name(), "Sleep"},
//                {DayOfWeek.SUNDAY.name(), "Netflix"}
//        };
//        */
//
//        Map<String, String> tb = new HashMap<String, String>();
//
//
//        Schedule schedule = new Schedule(tb);
//        Schedule table = new Schedule(tb);
//        Human angeline = new Human("Angel", "July", 1974);
//        Human brad = new Human("Brad", "Pit", 1964, table);
//        Human jon = new Human("Jon", "Johnny", 2000);
//        Human kind = new Human("Donald", "Trump", 2005);
//        String[] habits = {"Barking", "Eating", "Sleeping"};
//        Dog dog = new Dog(Pet.Species.DOG, "Bool", 70);
//        Fish fish = new Fish(Pet.Species.FISH, "Dole", 20);
//        Set<Pet> pets = new HashSet<Pet>();
//        pets.add(dog);
//        pets.add(fish);
//
//
//        Family family = new Family();
//        family.setFather(brad);
//        family.setMother(angeline);
//        family.addChild(jon);
//        family.addChild(kind);
//        family.setPet(pets);
//        family.deleteChild(1);
//
//
//        System.out.println();
//        System.out.print("Number of family members: ");
//        System.out.println(family.countFamily(family));
//        System.out.println();
//        System.out.println("****** About Family Members ******");
//        System.out.println(family.toString());

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