package javaoop.java_nested;

public class OuterClass {
    int number = 6;

    public void heyThere() {
        System.out.println("From Other class \n");
    }

    public static class Inner {
        int number = 8;

        public void innerT() {
            System.out.println("I'm from inner class");
        }
    }
}
