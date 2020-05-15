package xw.day12.practice01;

/*
    编写步骤：
    1. 定义类 Test2
    2. 定义 main方法
    3. 控制台输出5行整数类型常量值
    4. 控制台输出5行小数类型常量值
* */

public class Test2 {
    public static void main(String[] args) {
        // 控制台输出任意5行整数类型常量值
        System.out.println(-2147483648);
        System.out.println(-100);
        System.out.println(0);
        System.out.println(100);
        System.out.println(2147483647);

        // 控制台输出任意5行小数类型常量值
        System.out.println(-100.0);
        System.out.println(-10.0);
        System.out.println(0.0);
        System.out.println(10.9);
        System.out.println(100.9);

        /*
        运行结果：

            -2147483648
            -100
            0
            100
            2147483647
            -100.0
            -10.0
            0.0
            10.9
            100.9
        */
    }
}
