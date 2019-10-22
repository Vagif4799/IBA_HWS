package classWorks;

import java.util.*;

public class stringGenerator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int down = 97;
        int up = 122;
        int givenLength;

        System.out.print("Please, write the desired length of the String you want: ");

        givenLength = scan.nextInt();

        Random random = new Random();
        String word = "";
        for (int i = 0; i < givenLength; i++) {
            int randomLimitedInt = down + (int)
                    (random.nextFloat() * (up - down + 1));
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
