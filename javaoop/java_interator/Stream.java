package javaoop.java_interator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Stream {
    public static void main(String[] args) {

        // int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // int sumOfOddNumbers = Arrays.stream(numbers)
        // .filter(n -> n % 2 != 0)
        // .sum();

        // System.out.println("Sum of odd numbers: " + sumOfOddNumbers);

        // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        // int sum = numbers.stream()
        // .filter(x -> x % 2 == 0)
        // .map(x -> x * x)
        // .reduce(0, Integer::sum);

        // System.out.println(sum);

        List<String> strings = Arrays.asList("foo", "bar", "baz");
        List<Integer> lengths = strings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

                System.out.println(strings);
                System.out.println(lengths);
    }
}
