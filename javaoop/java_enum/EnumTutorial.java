package javaoop.java_enum;

public class EnumTutorial {
    public static void main(String[] args) {
        
        DaysOfTheWeek day = DaysOfTheWeek.Friday;
        
        if(day == DaysOfTheWeek.Friday){
            System.out.println("Yay it's Friday");
        }

        for(DaysOfTheWeek myDay : DaysOfTheWeek.values()){
            
        }
    }   
}
