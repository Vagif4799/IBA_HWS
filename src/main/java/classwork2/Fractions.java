package classwork2;
import java.util.*;

public class Fractions {

    public static String result (int d1, int d2, int f1, int f2) {
        int determinant = (d1*f2) + (d2*f1);
        int fraction = f1*f2;
        String result1 = Integer.toString(determinant);
        String result2 = Integer.toString(fraction);
        return result1 + "/" + result2;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write something there");
        String s = scan.nextLine();
        String[] newS = s.split("\\+");
        String a = newS[0];
        String[] newA = a.split("/");
        String b = newS[1];
        String[] newB = b.split("/");
        int d1 = Integer.parseInt(newA[0]);
        int f1 = Integer.parseInt(newA[1]);
        int d2 = Integer.parseInt(newB[0]);
        int f2 = Integer.parseInt(newB[1]);
        System.out.println(result(d1, d2, f1, f2));

    }
}
