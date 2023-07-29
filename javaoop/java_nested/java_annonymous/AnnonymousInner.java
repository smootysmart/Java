package javaoop.java_nested.java_annonymous;

public class AnnonymousInner {

    public static void main(String[] args) {
        
        Animal myAnimal = new Animal();
        myAnimal.makeNoise();

        Animal bigfoot = new Animal(){
            public void makeNoise(){
                System.out.println("Bruh~~~~");
            }
        };

        bigfoot.makeNoise();

        Runnable myAnonymousRunnable = new  Runnable() {

            @Override
            public void run() {
                System.out.println("I'm Annonymous Runnable ");
            }
            
        };

        myAnonymousRunnable.run();
    }
}
