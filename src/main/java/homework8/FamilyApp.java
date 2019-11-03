package homework8;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FamilyApp {
    public static void main(String[] args) {


        /*
        {
                {DayOfWeek.MONDAY.name(), "Go"},
                {DayOfWeek.TUESDAY.name(), "Read"},
                {DayOfWeek.WEDNESDAY.name(), "Walk"},
                {DayOfWeek.THURSDAY.name(), "Study"},
                {DayOfWeek.FRIDAY.name(), "Listen"},
                {DayOfWeek.SATURDAY.name(), "Sleep"},
                {DayOfWeek.SUNDAY.name(), "Netflix"}
        };
        */

        Map<String, String> tb = new HashMap<String, String>();


        Schedule schedule = new Schedule(tb);
        Schedule table = new Schedule(tb);
        Human angeline = new Human("Angel", "July", 1974);
        Human brad = new Human("Brad", "Pit", 1964, table);
        Human jon = new Human("Jon", "Johnny", 2000);
        Human kind = new Human("Donald", "Trump", 2005);
        String[] habits = {"Barking", "Eating", "Sleeping"};
        Dog dog = new Dog(Pet.Species.DOG, "Bool", 70);
        Fish fish = new Fish(Pet.Species.FISH, "Dole", 20);
        Set<Pet> pets = new HashSet<Pet>();
        pets.add(dog);
        pets.add(fish);


        Family family = new Family();
        family.setFather(brad);
        family.setMother(angeline);
        family.addChild(jon);
        family.addChild(kind);
        family.setPet(pets);
        family.deleteChild(1);


        System.out.println();
        System.out.print("Number of family members: ");
        System.out.println(family.countFamily(family));
        System.out.println();
        System.out.println("****** About Family Members ******");
        System.out.println(family.toString());


    }

}