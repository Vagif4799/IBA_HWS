package classwork12N;

import java.util.Random;

public class Sort {

    public int[] randomNumber () {

        int arr[] = new int [25];
        int min = 10;
        int max = 50;
        Random r = new Random();
        for (int i=0; i<25; i++) {
            arr[i] =  r.nextInt((max - min) + 1) + min;
        }

        return arr;
    }


    public int[] bubble (int arr[]) {

        int temp;


        for (int i=0; i<arr.length; i++) {
            for (int j=1; j<arr.length-i; j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }


    public int[] insertion (int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    public void show(int arr[], String name) {
        System.out.println("*** " + name.toUpperCase() + ": ***");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
