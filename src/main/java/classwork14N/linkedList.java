package classwork14N;

import java.util.LinkedList;
import java.util.List;

public class linkedList {
    public static void main(String[] args) {
        int a=5;
        int b = 3;
        List<Integer> llist = new LinkedList<>();
        llist.add(a);
        llist.add(b);
        System.out.println(llist.indexOf(a) + "\t\t" + llist.indexOf(b) );



    }
}
