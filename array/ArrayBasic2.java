package array;

public class ArrayBasic2 {
    public static void main(String[] args) {
        // Array 2มิติ
        String[][] products = {
                { "chair", "table", "lamp" },
                { "keyboard", "mouse", "keycap" },
                { "lipstick", "rollon", "cream" }
        };
        // // การเรียออกมาดู
        // // products [เลขแถว][เลขคอลัมน์]
        // System.out.println(products[1][1]);
        // System.out.println(products[1][2]);
        // // เปลี่ยนสมาชิก
        // products[1][2] = "mouse pad";
        // System.out.println(products[1][2]);

        // loop for array 2 มิติ
        for (int row = 0; row < products.length; row++) {
            for(int column = 0; column < products[row].length ; column++){
                System.out.println("row = " + row + " column = " + column +" products = " + products[row][column]);
            }
        }
    }
}
