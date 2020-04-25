package xw.day04.demo04;

//byte short int long float double char boolean
//String
//在调用输出语句的时候，println方法其实就是进行了多种数据类型的重载形式

public class Demo04MethodOverlaodPrint {
    public static void main(String[] args) {
        print(100);  // int
        print("Hello"); // String
    }

    public static void print(byte num) {
        System.out.println(num);
    }

    public static void print(short num) {
        System.out.println(num);
    }

    public static void print(int num) {
        System.out.println(num);
    }

    public static void print(long num) {
        System.out.println(num);
    }

    public static void print(float num) {
        System.out.println(num);
    }

    public static void print(double num) {
        System.out.println(num);
    }

    public static void print(char zifu) {
        System.out.println(zifu);
    }

    public static void print(boolean is) {
        System.out.println(is);
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
