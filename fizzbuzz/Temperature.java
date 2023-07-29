import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your celcius = ");
        double celcius = sc.nextInt();

        displayKelvin(celcius);
        displayFarenheit(celcius);
        sc.close();
    }

    public static void displayKelvin(double celcius) {
        double k = celcius + 273.15;
        System.out.println("Kelvin = " + k + "°K");
    }

    public static void displayFarenheit(double celcius) {

        double f = (celcius * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + f + "°F");
    }
}
