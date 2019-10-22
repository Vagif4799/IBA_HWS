package classWorks;

import java.util.*;

public class stringGenerator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int leftLimit = 97;
        int rightLimit = 122;
        int specificLength;

        System.out.print("Please, write the desired length of the String you want: ");

        specificLength = scan.nextInt();

        Random random = new Random();
        String word = "";
        for (int i = 0; i < specificLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            word += ((char) randomLimitedInt);
        }
        String result = word.toString();

        System.out.println(word);



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
