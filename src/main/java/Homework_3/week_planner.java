package Homework_3;

import java.util.*;
import java.lang.*;

public class week_planner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /**
         * declearing our array here
         */
        String[][] schedule = new String[7][2];

        /**
         * Filling the matrix with data
         */

        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "Choose a film";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "Watch Netflix";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "University Exam";
        schedule[5][0] = "Friday";
        schedule[5][1] = "Preparation for weekend";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "Hang out";


        System.out.println("Please, input the day of the week: ");

        String day;
        String task;

        while(true){

            day = scan.nextLine();

            /**
             * Advanced part begins here...
             */

            if(day.equals("change sunday".toLowerCase())){
                System.out.println("Enter new tasks: ");
                task = scan.nextLine();
                schedule[0][1] += ", " +  task;
            } else if(day.equals("change monday".toLowerCase())){
                System.out.println("Enter new tasks: ");
                task = scan.nextLine();
                schedule[1][1] += ", " +  task;
            } else if(day.equals("change tuesday".toLowerCase())){
                System.out.println("Enter new tasks: ");
                task = scan.nextLine();
                schedule[2][1] += ", " +  task;
            } else if(day.equals("change wednesday".toLowerCase())){
                System.out.println("Enter new tasks: ");
                task = scan.nextLine();
                schedule[3][1] += ", " +  task;
            } else if(day.equals("change thursday".toLowerCase())){
                System.out.println("Enter new tasks: ");
                task = scan.nextLine();
                schedule[4][1] += ", " +  task;
            } else if(day.equals("change friday".toLowerCase())){
                System.out.println("Enter new tasks: ");
                task = scan.nextLine();
                schedule[5][1] += ", " +  task;
            } else if (day.equals("change saturday".toLowerCase())){
                System.out.println("Enter new tasks: ");
                task = scan.nextLine();
                schedule[6][1] += ", " +  task;
            }



            switch (day.toLowerCase()) {
                case "monday":
                    System.out.println("Your tasks for Monday: " + schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.println("Your tasks for Tuesday: " + schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.println("Your tasks for Wednesday: " + schedule[3][1]);
                    break;
                case "thursday":
                    System.out.println("Your tasks for Thursday: " + schedule[4][1]);
                    break;
                case "friday":
                    System.out.println("Your tasks for Friday: " + schedule[5][1]);
                    break;
                case "saturday":
                    System.out.println("Your tasks for Saturday: " + schedule[6][1]);
                    break;
                case "sunday":
                    System.out.println("Your tasks for Sunday: " + schedule[0][1]);
                    break;
                    default:
                        if(day.equals("change monday") || day.equals("change sunday") || day.equals("change thursday") || day.equals("change tuesday") || day.equals("change wednesday") || day.equals("change friday") || day.equals("change saturday")){
                            System.out.println("Changes Added");
                        } else if (day.equals("exit".toLowerCase())) {
                            System.out.println("bye bye, see yaaa...");
                        } else {
                            System.out.println("Sorry, I don't understand you, please try again.");
                            System.out.println("Tip: Check your Spelling, please...");
                        }
            }

            if (day.equals("exit".toLowerCase())) {
                break;
            }


            System.out.println("Please, input the day of the week: ");



        }


    }

}
