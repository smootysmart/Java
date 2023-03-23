package method;

public class Method3 {
    public static void main(String[] args) {
            //โปรแกรมหลัก
            int result = minNumber(5,-10);
            System.out.println("Your lower number is = " + result);
            int sum = summation(50,50);
            System.out.println("your sum = " + sum);
        }    
    /*
     * ชนิดข้อมูลที่จะส่งออกไป ชื่อเมธอด (ค่าที่ส่งเข้ามา){
     * //การประมวลผล
     * return ชนิดค่าข้อมูล;
     * }
     */

     //เปรียบเทียบตัวเลข 2 ตัว

     static int  maxNumber(int a, int b){
        // การประมวลผล
        // int max = 0;
        // if(a > b){
        //     max = a;
        // } else {
        //     max = b;
        // }
        // return max;
        
        if (a == b){
            return a;
        } else if (a > b){
            return a;
        } else {
            return b;
        }
     }
     static int minNumber(int a,int b){
        if(a < b){
            return a;
        } else{
            return b;   
        }
     }
     static int summation(int x ,int y){
        int total = x + y;
        return total;
     }
}
