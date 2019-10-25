package homework4;

public class Family {

    public static void main(String[] args) {

        Pet bool = new Pet("Dol", "Bool", 40);
        Pet levon = new Pet("hasky", "Levon", 70);
        Pet ben = new Pet("english", "Benjamin", 85);
        Human tom = new Human("Tom", "Tommy", 25, bool);
        Human jerry = new Human("Jerry", "Freaky", 20, levon);
        Human berry = new Human("Berry", "Black", 2, ben);

        System.out.println(tom.getName());
        System.out.println(jerry.getName());
        System.out.println(berry.getName());
        System.out.println(tom.toString());

        tom.feedPet(false);
        jerry.feedPet(true);
        berry.feedPet(false);

    }

}


