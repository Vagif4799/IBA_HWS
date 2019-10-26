package homework2;

import java.util.*;


/**
 *
 * This one is under Construction.
 * Gonna re_send it ...
 *
 */

public class AreaShooting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("All set. Get ready to rumble!");

        System.out.println("How is your name? ");
        String name;
        name = scan.nextLine();

        System.out.println();


        String[][] arr = new String [5][5];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                arr[i][j] = "-";
            }
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] + " |");
            }
            System.out.println();
        }


        int randomRow = (int)(Math.random()*5);
        int randomColumn = (int)(Math.random()*5);

        System.out.println(randomRow + " " + randomColumn);


        int userRow;
        int userColumn;


        while (true){
            System.out.print("Please, enter a line for fire: ");
            userRow = scan.nextInt();
            System.out.print("Please, enter a shooting bar: ");
            userColumn = scan.nextInt();

            if(randomRow == userRow && randomColumn == userColumn) {
                arr[userRow-1][userColumn-1] = "x";
                break;
            } else if (randomRow != userRow || randomColumn != userColumn){
                arr[userRow-1][userColumn-1] = "*";
            }

            for (int i=0; i<arr.length; i++){
                for (int j=0; j<arr.length; j++){
                    System.out.print(arr[i][j] + " |");
                }
                System.out.println();
            }

        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] + " |");
            }
            System.out.println();
        }

        System.out.println("Congrats " + name);


    }

}

