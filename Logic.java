public class Logic {
    public static void main(String[] args) {
        /*
         * AND && => และ
         * OR || => หรือ
         * NOT ! => ไม่ (ตรขข้าม)
         */
        int  a=10,b=20;

        boolean c = (a == b); //True / False
        boolean d = (a < b);

        System.out.println(c);
        System.out.println(d);
        System.out.println((c || d)); //OR
        System.out.println((c && d)); // AND
        System.out.println(!(c && d)); //NOT

    }
}
