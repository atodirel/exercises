package interviewEx;

//Write a method that returns a comma-separated string based on a given list of integers.
// Each element should be preceded by the letter 'e' if the number is even, and preceded
// by the letter 'o' if the number is odd. For example, if the input list is (3,44), the output should be 'o3,e44'.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparated {

    public String getString(List<Integer> list) {

        String stringList = list.stream().
                                map(s -> s % 2 == 0 ? "e" + s : "o" + s).
                                collect(Collectors.joining(","));

        return stringList;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(44);
        list.add(5);
        list.add(8);
        list.add(11);
        System.out.println(new CommaSeparated().getString(list));
    }
}
