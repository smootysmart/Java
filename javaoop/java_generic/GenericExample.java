package javaoop.java_generic;

import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();
        Printer<String> stringPrinter = new Printer<>("Samart");
        stringPrinter.print();

        shout("Smart");
        shout(57);

    }
    private static <T> void shout(T thingToShout){
        System.out.println(thingToShout + "!!!!");
    }
}
