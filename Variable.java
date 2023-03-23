public class Variable {
    public static void main(String[] args) {
        int num1$=100;
        System.out.println(num1$);
        //////////////String/////////////////
        String a = "200",b = "50";
        System.out.println("a" + "=" + a );
        System.out.println("b" + "=" + b );
        //--> Change String to Int
        int c;
        c = Integer.parseInt(a);
        System.out.println("c" + "1" + "=" + c);
        c = c + 50;
        System.out.println("c" + "2" + "=" + c);
        //--> Change Int to String
        int num1 = 100;
        String age = String.valueOf(num1);
        System.out.println(age);
    }
}
