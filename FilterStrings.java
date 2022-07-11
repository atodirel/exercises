package interviewEx;

//Given a list of strings, write a method that returns a list of all strings that start
// with the letter 'a' (lower case) and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {
    public List<String> search(List<String> list) {

        return list.stream().filter(s -> s.startsWith("a"))
            .filter(s -> s.length()==3)
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("capac");
        list.add("tri");
        list.add("abacus");
        System.out.println("words starting with 'a' and with length of 3 letters: " + new FilterStrings().search(list));
    }
}
