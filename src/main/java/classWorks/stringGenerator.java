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
            int randomLimitedInt = down + (int)
                    (random.nextFloat() * (up - down + 1));
            word += ((char) randomLimitedInt);
        }
        String result = word.toString();

        return word;

    }


    public boolean test (String word, int specificNumber) {
        if (word == null) {
            return false;
        }

        for (int i=0; i<word.length(); i++) {
            if(!Character.isAlphabetic(word.charAt(i))) {
                return false;
            }
        }
        if (word.length() != specificNumber) {
            return false;
        }
        else return true;
    }


}
