package javaoop.java_interface;

public class Main {

    public static void main(String[] args) {
        Ironman h1 = new Ironman();
        h1.setName("Ironman");
        h1.setAge("40");
        h1.skill("Shooting");
        h1.disPlayHero();

        Hulk h2 = new Hulk();
        h2.setName("Hulk");
        h2.setAge("45");
        h2.skill("Strong");
        h2.disPlayHero();
    }
}
