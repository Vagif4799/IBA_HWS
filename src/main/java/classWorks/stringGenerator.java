package classWorks;

import java.util.*;

public class stringGenerator {
    public static void main(String[] args) {

        String s1 = randomWord(10);
        String s2 = randomWord(5);
        System.out.println(s1);
        System.out.println(s2);

    }

    public static String randomWord (int length) {

        int down = 97;
        int up = 122;

        Random random = new Random();
        String word = "";
        for (int i = 0; i < length; i++) {
            int randomLimitedInt = down + (int) (random.nextFloat() * (up - down + 1));
            boolean a = random.nextBoolean();
            if(a) {
                word += (Character.toUpperCase((char) randomLimitedInt) );
            } else {
                word += (((char) randomLimitedInt));
            }
        }
        String result = word.toString();

        return word;

    }



    public String capitalVowels (String x) {

        String rcv = "";
        String rcc = "";
        String rsc = "";
        String rsv = "";

        for (int i=0; i<x.length(); i++) {
            if(x.charAt(i) == 'A' || x.charAt(i) == 'E' || x.charAt(i) == 'I' || x.charAt(i) == 'O' || x.charAt(i) == 'U'){
                rcv+=x.charAt(i);
            } else if (x.charAt(i) == 'Z' || x.charAt(i) == 'B' || x.charAt(i) == 'T' || x.charAt(i) == 'G' || x.charAt(i) == 'H'){
                rcc+=x.charAt(i);
            } else if (x.charAt(i) == 'z' || x.charAt(i) == 'b' || x.charAt(i) == 't' || x.charAt(i) == 'g' || x.charAt(i) == 'h') {
                rsc+=x.charAt(i);
            } else rsv += x.charAt(i);
        }

        return rcv;
    }






}


