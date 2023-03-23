package method;
import java.util.Scanner;
public class Method2 {
    public static void main(String[] args) {
        //โปรแกรมหลัก
        String myIP = getIP();
        System.out.println(myIP);
        //ป้อนเงินเดือน
        Scanner kb = new Scanner(System.in);
        System.out.println("Input your salary = ");
        double salary = kb.nextDouble();
        System.out.println("Your Salary = " + salary);
        double bonus = getBonus();
        salary += bonus;
        System.out.println("Your salary + Bonus = " + salary);
    }
    // modifier ชนิดข้อมูลที่จะส่งออกมาทำงานในโปรแกรมหลัก ช่อเมธอด()()
    static String getIP(){
        return "127.0.0.0";
    }
    static Double getBonus(){
        return 1000.0;
    } 
}
