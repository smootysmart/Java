import java.util.Scanner;
public class InputTutorial {
    public static void main(String[] args) {
    //รับค่าข้อมูล
    //ข้อมูลแบบไหน ? ตัวเลข integer , float , long , double , ข้อความ String
    //ข้อความทำอะไร
    //ข้อความแบบตัวเลขทำอะไร => คำนวนได้ | คำนวนไม่ได้
    
    //ประกาศใช้ Class | new
    Scanner sc=new Scanner(System.in);
    String name = sc.nextLine();//รับค่า String จากแป้นพิมพ์ => name
    System.out.println(name);//แสดงข้อความที่พิมพ์
    }
    
}
