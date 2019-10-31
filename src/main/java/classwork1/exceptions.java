package classwork1;
import java.io.*;
public class exceptions {

    static int convert(String origin) {
            return Integer.parseInt(origin);
    }

    public static void main(String[] args) {
        String in = "123a";
        try {
            int val = convert(in);
            System.out.println(val);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong value given");
        }


    }
}
