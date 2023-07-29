package javaoop.java_interface;

public class Hulk extends SuperHero implements SkillHero,Nation{

    public void skill(String skill){
        System.out.println("Skill = "+skill);
    }

    public void moving(String moving){
        System.out.println("100 mps");
    }
    public void weapon(String weapon){
        System.out.println("Weapon = "+ weapon);
    }
    public void jumping(String jump){
        System.out.println("10 m");
    }
    public void setNation(String nation){
        
    }
}
