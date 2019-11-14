//package classwork12N;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class sorting {
//
//
//    public static void main(String[] args) {
//
//
//        int[] a = {1,3,5,7,13}; // sorted !
//        int[] b = {2,4,6,20,40,100}; // sorted !
//        // O(a.length+b.length) = 11
//        int[] c = merge(a,b);
//        System.out.printf("a:%s\n", Arrays.toString(a));
//        System.out.printf("b:%s\n", Arrays.toString(b));
//        System.out.printf("c:%s\n", Arrays.toString(c));
//
//    }
//
//
//    private static int[] merge(int[] a, int[] b) {
//        int[] data = new int[a.length+b.length];
//
//        int k = 0;
//        int j = 0;
//
//        for (int i=0; i<data.length; i++) {
//
//            if (a[k] < b[j] && k>i) {
//                data[i] = a[k];
//                k++;
//            } else {
//                data[i] = b[j];
//                j++;
//            }
//        }
//
//        return data;
//    }
//
//}
