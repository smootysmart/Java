package javaoop.java_interator;

import java.util.Arrays;
import java.util.Iterator;

public class MyIterator {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // create an iterator from the array
        Iterator<Integer> iterator = Arrays.stream(numbers).iterator();

        // use the iterator to iterate over the array and calculate the sum of the even numbers
        int sum = 0;
        while (iterator.hasNext()) {
            // TODO: complete this part
        }

        // print out the sum of the even numbers
        System.out.println("Sum of even numbers: " + sum);
    }
}
