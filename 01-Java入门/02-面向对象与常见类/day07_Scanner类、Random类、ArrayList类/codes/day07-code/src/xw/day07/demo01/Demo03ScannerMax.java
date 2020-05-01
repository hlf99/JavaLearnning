package xw.day07.demo01;

import java.util.Scanner;

/*
* 题目：
* 键盘输入三个int数字，然后输出其中的最大值
*
* 思路：
* 1. 既然是键盘输入，可定要用到Scanner
* 2. Scanner的三个步骤：导包、创建、使用nextInt()方法
* 3. 既然是三个int数字，那么调用三次nextInt()方法，得到三个int变量
* 4. 无法同时判断三个数字谁最大，用该转换为两个步骤：
*   4.1 首先判断前两个数字谁大，拿着前两个的最大值
*   4.2 拿着前两个的最大值，再和第三个数字比较，得到三个数字中的最大值
* 5. 打印最终结果
* */

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c = sc.nextInt();

        // 首先得到前两个数字中的最大值
        int max = a > b ? a : b;
        // 再让前两个数字中的最大值和对三个数比较，得到三个数中的最大值
        max = c > max ? c : max;

        System.out.println("最大值为：" + max);
    }
}
