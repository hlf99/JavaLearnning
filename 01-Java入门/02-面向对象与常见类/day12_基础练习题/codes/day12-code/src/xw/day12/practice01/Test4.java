package xw.day12.practice01;

/*
编写步骤：

    1. 定义类 Test4
    2. 定义 main方法
    3. 定义2个 byte类型变量,分别赋byte类型范围内最大值和最小值,并输出在控制台.
    4. 定义2个 short类型变量,分别赋short类型范围内的值,并输出在控制台.
    5. 定义2个 int类型变量,分别赋int类型范围内的值,并输出在控制台.
    6. 定义2个 long类型变量,分别赋超过int类型范围的值,并输出在控制台.
*/


public class Test4 {
    public static void main(String[] args) {
        // 定义2个 byte类型变量,分别赋byte类型范围内最大值和最小值,并输出在控制台.
        // 取值范围：-128~127
        byte num1 = -128;
        byte num2 = 127;
        System.out.println(num1);
        System.out.println(num2);

        // 定义2个 short类型变量,分别赋short类型范围内的值,并输出在控制台.
        // 取值范围：-32768~32767
        short num3 = -32768;
        short num4 = 32767;
        System.out.println(num3);
        System.out.println(num4);

        // 定义2个 int类型变量,分别赋int类型范围内的值,并输出在控制台.
        // 取值范围：-231次方~2的31次方-1
        int num5 = -2147483648;
        int num6 = 2147483647;
        System.out.println(num5);
        System.out.println(num6);

        // 定义2个 long类型变量,分别赋超过int类型范围的值,并输出在控制台.
        // 取值范围：-2的63次方~2的63次方-1
        long num7 = -2147483649L;
        long num8 = 2147483648L;
        System.out.println(num7);
        System.out.println(num8);

        /*
        运行结果：

            -128
            127
            -32768
            32767
            -2147483648
            2147483647
            -2147483649
            2147483648
        */
    }
}
