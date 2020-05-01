package xw.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/*
* 题目要求：
* 根据int变量n的值，来获取随机数字，范围是[1, n]，可以取到1也可以取到n
*
* 思路：
* 1. 定义一个随机int变量n，随意赋值（自己输入）
* 2. 要使用Random，三个步骤：导包、创建、使用
* 3. 如果变量n为10，那么范围就是0~9，然而我们想要的是1~10，可以发现：整体+1即可。
* 4. 打印输出随机数
* */

public class Demo03Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n = sc.nextInt();
        System.out.println("===================");

        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int random = r.nextInt(n) + 1;
            System.out.println(random);
        }
    }
}
