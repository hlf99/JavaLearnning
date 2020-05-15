package xw.day12.practice01;

/*
编写步骤：

    1. 定义类 Test7
    2. 定义 main方法
    3. 定义两个整数变量a，b并赋值
    4. 控制台输出变量a，b互换前的值
    5. 定义一个第三方变量temp，不赋值
    6. 利用第三方变量temp使a，b的值互换
    7. 控制台输出变量a，b互换后的值
*/


public class Test7 {
    public static void main(String[] args) {
        // 定义两个整数变量并赋值
        int a = 10;
        int b = 20;
        // 控制台输出变量a，b的值
        System.out.println("互换前：");
        System.out.println(a);
        System.out.println(b);

        // 定义一个临时的第三方变量，不赋值
        int temp;
        // 利用第三方变量，使a，b的值互换
        temp = a;
        a = b;
        b = temp;

        // 控制台输出变量a，b互换后的值
        System.out.println("互换后：");
        System.out.println(a);
        System.out.println(b);

        /*
        运行结果：

            互换前：
            10
            20
            互换后：
            20
            10
        */
    }
}
