package homework2;

import java.util.*;


/**
 *
 * This one is under Construction.
 * Gonna re_send it ...
 *
 */

public class areaShooting {
    public static void main(String[] args) {

     int[][] arr = new int[6][6];


        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                arr[i][j] = j;
            }
        }

        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }



    }

}
