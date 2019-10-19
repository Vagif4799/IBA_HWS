package Homework_1;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {

        /**
         * Basic instructions are provided for the user.
         */
        System.out.println("Let the Game begin!");
        System.out.println("Just Enter number between 1-100. You will get 5 shot, Can you hit it ?");
        /**
         * @param initial_number will be generated random number which will be searched by the gamer.
         */
        int initial_number = (int)(Math.random()*100);
        Scanner scan = new Scanner(System.in);
        /**
         * @param entered_number is the number that guessed each time by the user.
         */
        int entered_number;
        int[] entered_numbers = new int [5];
        /**
         * Here our rounds begin...
         */
        for (int i=0; i<5; i++) {
            entered_number = scan.nextInt();
            entered_numbers[i] = entered_number;
            if (entered_number < initial_number) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (entered_number > initial_number) {
                System.out.println("Your number is too big. Please, try again...");
            } else {
                System.out.println("Congratulations");
                break;
            }
        }
    }
}
