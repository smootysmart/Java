package lamda;

public class lamda {
    public static void main(String[] args) {

        Printable lamPrintable = (s) -> System.out.println("Meow " + s);
        printThing(lamPrintable);

    }

    static void printThing(Printable thing) {
        thing.print("!");
    }
}
