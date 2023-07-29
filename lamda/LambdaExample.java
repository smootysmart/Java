package lamda;

import java.util.Arrays;

public class LambdaExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }
}
