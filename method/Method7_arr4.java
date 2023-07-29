package method;

import java.util.Arrays;

public class Method7_arr4 {
    public static void main(String[] args) {
        int[] numberA = { 10, 100, 30, 40, 50, -50 };
        int[] numberB = copyArray(numberA);
        displayArray(numberA);
        displayArray(numberB);
    }

    static void displayArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    ///////////////////////////////////////////////////////////////////////////////////

    static void swapElement(int [] a , int x , int y){
        int temp = a[x]; // a = 10
        a[x] = a[y]; // a = 30
        a[y] = temp;
    }

    static int[] copyArray (int [] a){
        // โยน Array A = 6 ช่องว่าง Array ใหม่ = 6 ช่องว่าง
        int [] newArr = new int[a.length];
        for(int i = 0;i < a.length;i++){
            newArr[i] = a[i];
        }
        return newArr;

    }

}
