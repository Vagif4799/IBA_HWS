package classwork3;
import java.util.*;

public class ex1 {

    public static void sum (String order) {
        int total=0;
        int count=0;
        ArrayList<String> wrong = new ArrayList<String>();
        String[] newOrder = order.split(" ");
        for(int i=0; i<newOrder.length; i++) {
            try {
                total += Integer.parseInt(newOrder[i]);
            } catch (NumberFormatException ex) {
                wrong.add(newOrder[i]);
                count++;
            }
        }
        System.out.println(total + " : " + count + " : " + wrong);

    }


    public static void main(String[] args) {

        String first = "1 2 -3 abc";
        String second = "1 -3 abc";
        String third = "1 2 3";

        sum(second);
        sum(third);



    }


}
