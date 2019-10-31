package classwork;
import java.util.*;

public class NumberSorting {


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i=0; i<30; i++) {
            arr.add((int)(Math.random()*100));
        }

        System.out.println(arr.toString());


         arr.sort(new Comparator <Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if(a%2 == 0 && b%2 !=0) return 1;
                if(a%2 != 0 && b%2 ==0) return -1;
                if(a%2 == 0) return a-b;
                return b-a;
            }

        });


        System.out.println(arr.toString());




    }

}
