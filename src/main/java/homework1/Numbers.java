package homework1;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let the Game begin!");

        System.out.println("Please, Enter your name: ");
        String name;
        name = scan.nextLine();


        System.out.println("Just Enter number between 1-100. Can you hit it ?");


        int initialNumber = (int)(Math.random()*100);

        int enteredNumber;

        int[] enteredNumbers = new int [100];
        int i = 0;
        while (true) {
            enteredNumber = scan.nextInt();
            enteredNumbers[i] = enteredNumber;
            if (enteredNumber < initialNumber) {
                System.out.print("Your Previous Numbers: " );
                for(int a=0; a<i+1;a++) {
                    System.out.print(enteredNumbers[a] + " ");
                }
                System.out.println();
                System.out.println("Your number is too small. Please, try again.");
            } else if (enteredNumber > initialNumber) {
                System.out.print("Your Previous Numbers: " );
                for(int a=0; a<i+1;a++) {
                    System.out.print(enteredNumbers[a] + " ");
                }
                System.out.println();
                System.out.println("Your number is too big. Please, try again...");
            } else {
                System.out.println();
                System.out.println("Congratulations " + name + "! ");
                break;
            }

            i++;
        }
    }
}
