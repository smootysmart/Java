import java.util.Scanner;

public class If__Statement {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        boolean result = 10 > 5;
        System.out.println("Insert your age :");
        int age = kb.nextInt();
        if(age >= 15){
            System.out.println("Your prefix name is Mr./Mrs.");
        }else{
            System.out.println("you are boy/girl");
        }

        System.out.println("End of progress");
        // if(result){
        // //ทำอะไร....
        // System.out.println("10 more than 5");
        // }
        /////////คะแนน/////////////
        // if(age <= 50){
        //     System.out.println("F");
        // } else if(age <= 59){
        //     System.out.println("D");
        // } else if(age <= 60){
        //     System.out.println("C");
        // } else if(age <= 79){
        //     System.out.println("B");
        // } else if(age <= 100){
        //     System.out.println("A");
        // } else{
        //     System.out.println("Error");
        // }
    }
    

}
