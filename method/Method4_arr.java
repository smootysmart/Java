package method;

import java.util.Scanner;

public class Method4_arr {
    public static void main(String[] args) {
        int[] numberA = { 10, 20, 30, 40, 50 };
        displayArray(numberA);

        // loop check array in A
        // for (int i = 0; i < numberA.length; i++) {
        // System.out.println("NO. = " + i + " is " + numberA[i]);
        // }
        int[] numberB = { -50, -20, -30, 100, 50 };
        displayArray(numberB);

        // for (int i = 0; i < numberB.length; i++) {
        // System.out.println("NO. = " + i + " is " + numberB[i]);
        // }
        int[] numberC = { 100, 200 };
        displayArray(numberC);

    }

    // แสดงผลตัวเลขใน array ที่ส่งเข้ามาทำงานในเมธอด
    static void displayArray(int[] arr) { // รับค่าเข้ามาทำงาน
        System.out.println("(");
        for (int i = 0; i < arr.length; i++) {
            // System.out.println("No. = " + i + " is " + arr[i]);
            System.out.println(arr[i]);
            if (i < arr.length - 1) {
                System.out.println(",");

            }
        }
        System.out.println(")");
        // System.out.println("########## END #############");
    }
}
