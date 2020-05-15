package xw.day12.practice02;

/*
编写步骤：

        1. 定义类 Test10
        2. 定义 main方法
        3. 定义add方法,打印两个变量的和
        4. 定义sub方法,打印两个变量的差
        5. 定义mul方法,打印两个变量的积
        6. 定义div方法,打印两个变量的商
        7. 定义remain方法,打印两个变量的余数
        8. main方法中,依次调用add方法,sub方法,mul方法,div方法,remain方法
*/

public class Test10 {
    public static void main(String[] args) {
        add(); // 300
        sub(); // -100
        mul(); // 20000
        div(); // 0
        remain(); // 100
    }

    public static void add() {
        int x = 100;
        int y = 200;

        System.out.println("x,y的和为：" + (x + y));
    }

    public static void sub() {
        int x = 100;
        int y = 200;

        System.out.println("x,y的差为：" + (x - y));
    }

    public static void mul() {
        int x = 100;
        int y = 200;

        System.out.println("x,y的积为：" + (x * y));
    }

    public static void div() {
        int x = 100;
        int y = 200;

        System.out.println("x,y的商为：" + (x / y));
    }

    public static void remain() {
        int x = 100;
        int y = 200;

        System.out.println("x,y的余数为：" + (x % y));
    }
}
