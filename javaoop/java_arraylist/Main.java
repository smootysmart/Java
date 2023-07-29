package javaoop.java_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(11);     
        number.add(20);
        number.add(5);

        System.out.println("List the arraylist : " + number);

        Collections.sort(number);

        System.out.println("List the number that sort : " + number);

        number.remove(Integer.valueOf(5));

        System.out.println("List number that remove one of the array : " + number);

        if(number.contains(5)){
            System.out.println("It has number 5 in an array");
        } else {
            System.out.println("It isn't have number 5 in an array");
        }
    }
}
