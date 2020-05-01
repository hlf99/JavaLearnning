package xw.day07.demo01;

import java.util.Scanner; // 1. 导包

/*
* 题目：键盘输入两个int数字，并求出和值。
*
* 思路：
* 1. 既然需要键盘输入，那么就用Scanner
* 2. Scanner的三个步骤：导包、创建、使用
* 3. 需要的两个数字，所以要调用两次nextInt()方法
* 4. 得到两个数字，就需要加在一起
* 5. 将结果打印输出
* */

public class Demo02ScannerSum {
    public static void main(String[] args) {
        // 2. 创建
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();

        int result = num1 + num2;

        System.out.println("两个数的为：" + result);
    }
}
