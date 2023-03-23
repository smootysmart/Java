public class Prepost {
    public static void main(String[] args) {
        int a = 5;
        //pre หน้า | post หลัง

        System.out.println("First a =" + a);
        System.out.println(++a);
        System.out.println("check pre =" + a);
        System.out.println(a++);
        System.out.println("check post =" + a);
        
        int b = 5;
        System.out.println("first b =" + b);
        System.out.println(b--);
        System.out.println("check post =" + b);
        System.out.println(--b);
        System.out.println("check pre =" + b);
    }
}
