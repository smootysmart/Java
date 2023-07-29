package javaoop.java_nested;

public class Main {
    
    public static void main(String[] args) {
        OuterClass n1 = new OuterClass();
        n1.heyThere();

        OuterClass.Inner n2 = new OuterClass.Inner();
        n2.innerT();
    }
}
