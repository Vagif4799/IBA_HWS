package classwork12N;

public class bitOperations {
    public static void main(String[] args) {

        int a = 43;
        int b = 56;


        System.out.println( a + " in Binary");

        String result = "";

        while(a!=0) {
            result += (a%2);
            a = a >> 1;
        }

        String reverse = "";

        for(int i = result.length() - 1; i >= 0; i--)
        {
            reverse += result.charAt(i);
        }


        System.out.println(reverse);

        int intResult = 0;

        for (int i=0; i<result.length(); i++) {
            if(result.charAt(i) == '1') {
                intResult += (int) (Math.pow(2, i) );
            }
        }

        System.out.println(intResult);


    }
}
