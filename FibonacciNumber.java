package interviewEx;

//Write a method that returns the nth element of the Fibonacci Sequence
//    The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
//    The next number is found by adding up the two numbers before it.
//    Assume that indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ...

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {

    public Integer fibonacci(Integer n) {

        int result = 0;
        int x = 0;
        int y = 1;

        if (n==1) return 1;
        for (int i=1; i<n; i++){
            result = x + y;     //1 2 3 5 8 13
            x = y;              //1 1 2 3 5
            y = result;         //1 2 3 5 8
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new FibonacciNumber().fibonacci(0));
    }
}
