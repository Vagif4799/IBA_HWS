package homework5;

import java.util.*;

public class FamilyApp {
    public static void main(String[] args) {
        Human angeline = new Human("Angel", "July", 1974);
        Human brad = new Human("Brad", "Pit", 1964);
        Human jon = new Human("Jon", "jonny", 2000);
        Human kind = new Human("Donald", "Trump", 2005);
        String[] habits = {"Barking", "Eating", "Sleeping"};
        Pet dog = new Pet("Bool", "Dog", 70);

        Family family = new Family();
        family.setFather(brad);
        family.setMother(angeline);
        family.addChild(jon);
        family.addChild(kind);
        family.setPet(dog);
        System.out.print("Number of family members: ");
        System.out.println(family.countFamily(family));
        family.deleteChild(0);
        System.out.println(family.countFamily(family));

        System.out.println(family.toString());

    }

}