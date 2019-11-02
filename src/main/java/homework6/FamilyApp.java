package homework6;

public class FamilyApp {
    public static void main(String[] args) {
        // Creating Human objects for mother and father respectively
        Family family = new Family();

        DayOfWeek table1;

        String[][] tb = {
                {DayOfWeek.SUNDAY.name(), "Go"},
                {DayOfWeek.TUESDAY.name(), "Read"},
                {DayOfWeek.WEDNESDAY.name(), "Walk"},
                {DayOfWeek.THURSDAY.name(), "Study"},
                {DayOfWeek.FRIDAY.name(), "Listen"},
                {DayOfWeek.SATURDAY.name(), "Sleep"},
                {DayOfWeek.SUNDAY.name(), "Netflix"}
        };

        Schedule schedule = new Schedule(tb);

        short iq = 100;
        Schedule table = new Schedule(tb);
        Human angeline = new Human("Angel", "July", 1974);
        Human brad = new Human("Brad", "Pit", 1964, table);
        // Crating Human objects as children
        Human jon = new Human("Jon", "jonny", 2000);
        Human kind = new Human("Donald", "Trump", 2005);
        // Pets should get some habits that equal() will use it
        String[] habits = {"Barking", "Eating", "Sleeping"};
        // Enum decleration here and its usage
        Pet.Species animal1 = Pet.Species.DOG;
        Pet dog = new Pet(animal1, "Dog", 70);
        // After all family members ready, we can set it up

        family.setFather(brad);
        family.setMother(angeline);
        family.addChild(jon);
        family.addChild(kind);
        family.setPet(dog);
        System.out.print("Number of family members Before Delete: ");
        System.out.println(family.countFamily(family));
        family.deleteChild(0);
        System.out.print("Number of family members After Delete: ");
        System.out.println(family.countFamily(family));
        System.out.println(family.toString());
        // Here I'm running loop to realize how finalize() method functions
        for(int i=0; i<100000; i++) {
            new Human();
        }
       // Schedule.DayOfWeek day = Schedule.DayOfWeek.FRIDAY;
       // System.out.println(day.name());

    }

}