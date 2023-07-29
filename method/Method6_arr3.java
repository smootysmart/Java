package method;

import java.util.Arrays;

public class Method6_arr3 {
    public static void main(String[] args) {
        int[] numberA = { 10, 100, 30, 40, 50, -50 };
        int[] numberB = { 10, 100, 30, 40, 50, -50 };
        int[] numberC = { 10, 20, 30};
        System.out.println("your comapare is " + compareArray(numberA, numberB));
        
        displayArray(numberC);
        swapElement(numberC, 0, 1);
        displayArray(numberC);
    }

    static void displayArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static boolean compareArray(int[] a, int[] b) {
        if(a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    ///////////////////////////////////////////////////////////////////////////////////

    static void swapElement(int [] a , int x , int y){
        //x = startposition
        //y = finalposition
        //10 20 30 => 0, 1, 2 สลับตำแหน่ง
        // จัดเก็บตำแหน่งชั่วคราว

        int temp = a[x]; // a = 10
        a[x] = a[y]; // a = 30
        a[y] = temp;
        

    }

}
