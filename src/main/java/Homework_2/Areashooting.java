package Homework_2;

import java.util.*;

public class Areashooting {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number;
        number = sc.nextInt();
        int arr[][] = PrintSquare(number);


        int k = 0, m = number - 1, n = number;
        int l = 0;
        if (number % 2 == 0)
            m = number - 1;
        else
            m = number;

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%3d", arr[k][j]);
            }
            System.out.println("");
            l = l + 2;
            k = l;

        }
        k = number - 1;
        for (int i = n / 2; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%3d", arr[k][j]);
            }
            m = m - 2;
            k = m;
            System.out.println("");
        }

        int target = (int)(Math.random()* (number*number));
        System.out.println("Target is: " + target);


    }

    public static int[][] PrintSquare(int n)
    {
        int arr[][] = new int[n][n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = k;
                k++;
            }
        }
        return arr;
    }

}
