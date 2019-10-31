package learning2;

import java.util.*;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        List<String> collected = list.stream()
                .filter(item -> item > 2)
                .map(element -> element*2)
                .map(item -> String.format("aa%dbb ", item))
                .collect(Collectors.toList());

        collected.forEach(item-> System.out.printf(item));


        String joined = list.stream()
                .filter(item -> item > 2)
                .map(element -> element*2)
                .map(item -> String.format("aa%dbb ", item))
                .collect(Collectors.joining("-", "<<", ">>"));

        System.out.println(joined);






    }
}
