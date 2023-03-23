package method;

public class Method1 {
    public static void main(String[] args) {
        //การเรียกใช้
        display("Samart");//Samart => Argument\
        fullName("Noppakrit","Nitichaisatit");
        fullName("Name","LastName");
        plus(10,20);
    }
    //การสร้างเมธอด
    static void display(String message){//message is parameter
        //กลุ่มคำสั่งที่อยากให้ทำงาน
        System.out.println("Show words" + message);
    }
    static void fullName(String firstname, String lastname){
        System.out.println("fistName = " + firstname + " lastName = " + lastname);
    }
    static void plus(int a, int b){
        int c = a + b;
        System.out.println("Answer = " + c);
    }
    //ไม่มีรับข้อมูล
    // static void plus(){
    //     int a = 10;
    //     int b = 20;
    //     int c = a+b;
    //     System.out.println("eual " + c);
    // }

    // static void openVideo(){
    //     //คำสั่งเปิดไฟล์เล่น video
    //     System.out.println("open video");
    // }
    // static void playVideo(){
    //     //คำสั่งเล่นไฟล์ Video
    //     System.out.println("play video");
    // }
    // static void pauseVideo(){
    //     //คำสั่งหยุด video
    //     System.out.println("pause video");
    // }
    // static void  exitProgram(){
    //     System.out.println("Clear Program");
    //     System.out.println("Exit Program");
    // }
}

