package method;

public class Method5__arr2 {
    public static void main(String[] args) {
        int[] numberA = { 10, 20, 30, 40, 50 };
        System.out.println("Your Max Number is " + findMaxInArray(numberA));
        int[] numberB = { -50, -20, -30, 100, 50 };
        System.out.println("Your Max Number is " + findMaxInArray(numberB));
        int[] numberC = { 100, 200 };
        System.out.println("Location is " + findMaxIndex(numberA));
        
    }

    static void displayArray(int[] arr) {
        System.out.println("(");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (i < arr.length - 1) System.out.println(",");
        }
        System.out.println(")");
    }
    static int findMaxInArray(int [] arr){
        //ค้นหาค่ามากที่สุดใน Array
        // ได้ค่ามากที่สุด
        int maxValue = arr[0] ;//เก็บค่าสูงสุดไว้เป็นค่าเริ่มต้น
        for(int i = 0; i < arr.length;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }

        return maxValue;
    }
    static int findMaxIndex(int [] arr){
        int maxIndex = 0; //เก็บตำแหน่ง index สมาชิกที่มีค่าตัวเลขมากที่สุดใน arr
        for(int i =  0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex]){ //min สลับ > เป็น <
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
