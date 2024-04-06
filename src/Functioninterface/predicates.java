package Functioninterface;


import java.util.Arrays;
import java.util.List;


public class predicates {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = list.stream().filter(i -> i % 2 == 0)
                        .map(n->n*n)
                                .toList();
        System.out.println(result);
    }
}
