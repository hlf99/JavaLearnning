package xw.day12.practice02;

/*
编写步骤：

    1. 定义类 Test1
    2. 定义 main方法
    3. 定义两个byte类型变量b1,b2,并分别赋值为10和20.
    4. 定义变量b3,保存b1和b2的和,并输出.
    5. 定义两个short类型变量s1,s2,并分别赋值为1000和2000.
    6. 定义变量s3,保存s1和s2的和,并输出.
    7. 定义一个char类型变量c1赋值为'a',一个int类型变量i1赋值为30.
    8. 定义变量ch3,保存c1和i1的差,并输出.
*/


public class Test1 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1 + b2;
        System.out.println("byte类型b1和b2的和为：" + b3);

        short s1 = 1000;
        short s2 = 2000;
        int s3 = s1 + s2;
        System.out.println("short类型s1和s2的和为：" + s3);

        char c1 = 'a';
        int i1 = 30;
        int ch3 = c1 - i1;
        System.out.println("char类型ch1和int类型i1的差为：" + ch3);


        /*
        运行结果：

            byte类型b1和b2的和为：30
            short类型s1和s2的和为：3000
            char类型ch1和int类型i1的差为：67
        */
    }
}
