package homework5;

import java.util.*;

public class FamilyApp {
    public static void main(String[] args) {
        Human angeline = new Human("Angel", "July", 34);
        Human brad = new Human("Brad", "Pit", 40);
        Human jon = new Human("Jon", "jonny", 50);
        Family family = new Family();
        family.addChild(jon);
        family.addChild(brad);
        family.addChild(angeline);

        for (int i=0; i<family.getChildren().length; i++) {
            System.out.println(family.toString());
        }

    }

}