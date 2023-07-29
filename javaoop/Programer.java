package javaoop;

public class Programer extends Employee{
    
    //Method
    // public void showProgrammer(){
    //     setSalary(40000.0);
    // }

    //constructor
    // public String skill = "Java";
    
    // public Programer(String name,Double salary){
    //     super(name,salary);
    //     System.out.println("I'm Programing");
    // }

    //overloading method
    public void skill(){
        System.out.println("Don't have skill");
    }
    public void skill(String language){
        System.out.println("Skill = "+ language);
    }
    public void skill(String...language){
        for(int i=0;i < language.length; i++){
            System.out.println("Skill = "+language[i]);
        }
    }

    //Override
    public void bonus(){
        System.out.println("Bonus = 20%");
    }
}
