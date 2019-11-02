package november2;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RandomArray {
    public static void main(String[] args) {

        int [] myArr = new int[30];

        for (int i=0; i<myArr.length; i++) {
            myArr[i] = (int)(Math.random()*100);
        }

        int low = 0;
        int low2 = 0;

        low = myArr[0];

        for (int i=0; i<myArr.length; i++) {

            if(low > myArr[i]) {
                low = myArr[i];
            }
        }

        low2 = myArr[0];

        for (int i=0; i<myArr.length; i++) {

            if(low2 > myArr[i] && myArr[i] != low) {
                low2 = myArr[i];
            }
        }

        for (int i =0; i<myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println();

        System.out.println(  low + low2);

        System.out.printf("%d + %d = %d [anywhere in an array]\n", low, low2, low+low2);

        int initialSum = 0;

            initialSum = myArr[0] + myArr[1];

        List<Integer> nums = new ArrayList<>();

        for(int t : myArr) {
            nums.add(t);
        }

       // Map<Integer, Integer> pair =

//                 nums.stream()
//                .map(x->(myArr[x]+myArr[x+1]))
//                .collect(Collectors.toMap())



    }


}
