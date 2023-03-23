import java.util.Scanner;

public class Assignment_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bmi;
        System.out.println("Insert Weight User (kg) :");
        double wt = sc.nextDouble();
        System.out.println("Insert Height User (cm) :");
        double ht = sc.nextDouble();
        ht /= 100;
        System.out.println("Your Weight is =" + wt);
        System.out.println("Your Height is =" + ht);
        bmi = wt / (ht * ht);
        System.out.println("Your BMI is =" + bmi);

    }

}
