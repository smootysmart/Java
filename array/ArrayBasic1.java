package array;

public class ArrayBasic1 {

    public static void main(String[] args) {
        // การสร้าง Array

        // //แบบกำหนดขนาดเอาไว้
        // int[]number = new int[4] ;
        // //กำหนดค่าลงไป
        // number[0]=10;
        // number[1]=20;
        // number[2]=30;
        // number[3]=40;

        // System.out.println(number[3]);

        // แบบกำหนดสมาชิก
        // int[] number ={10,20,30,40,50};
        // System.out.println(number[3]);

        // // int size = number.length;
        // // System.out.println(size);
        // System.out.println(number.length);//นับจำนวนสมาชิก

        // //Loop for
        int[] number ={10,20,30,40,50};

        // int count = number.length;//10
        // for (int i=0;i<count;i++){
        // System.out.println(number[i]);
        // }
        // //

        // For Each
        String[] fruits = { "malagor", "mamoung", "watermelon" };
        for (String data : fruits) {
            System.out.println(data);
        }
        for(int date : number){
            System.out.println(date);
        }
        int sum = 0;
        for(int item:number){
            sum += item;
            //System.out.println("All " + sum); //บอกทุกตัว9
        }
        System.out.println("All " + sum);
    }
}
