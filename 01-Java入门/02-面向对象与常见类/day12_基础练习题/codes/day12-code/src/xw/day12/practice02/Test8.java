package xw.day12.practice02;

/*
编写步骤：

        1. 定义类 Test8
        2. 定义 main方法
        3. 定义printNum方法,在main方法中调用printNum方法
        4. printNum方法中,定义int类型变量i赋值为10,j 赋值为20;
        5. printNum方法中,将 i/5 的商 与 j的和 赋值给j
        6. printNum方法中,定义int类型变量k,将j赋值给k.
        7. printNum方法中,最后同时输出 i, j ,k 的值,查看结果.
*/

public class Test8 {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {
        // 定义int类型变量i赋值为10,j 赋值为20
        int i = 10;
        int j = 20;

        // 将 i/5 的商 与 j的和 赋值给j
        j += i / 5; // 22

        // 定义int类型变量k,将j赋值给k
        int k = j; // 22

        // 最后同时输出 i, j ,k 的值,查看结果
        System.out.println("i:" + i + " j:" + j + " k:" + k); // i:10 j:22 k:22
    }
}
