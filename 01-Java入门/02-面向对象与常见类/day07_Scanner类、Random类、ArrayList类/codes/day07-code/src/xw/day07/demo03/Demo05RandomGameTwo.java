package xw.day07.demo03;

/*
 * 题目变形：
 * 猜数字的次数有限，如果没有在指定次数内猜中数字，则提示游戏失败，否则提示游戏成功；
 * 当猜错后，会提示剩余猜测次数。
 *
 * 思路：
 * 1. 获取一个随机数，使用Random的nextInt()方法
 * 2. 需要从键盘输入一个数字，用Scanner
 * 3. 获取键盘输入的数字，使用Scanner的nextInt()方法
 * 4. 将随机数与键盘输入的数字进行比较，同时要记录猜的次数
 *   如果比指定数字大，提示太大了，并且重试
 *   如果比指定数字小，提示太小了，并且重试
 *   如果和指定数字一样大，游戏结束
 * 5. 重试就是再来一次，循环次数是确定的(10次)，使用for循环
 * */

import java.util.Random;
import java.util.Scanner;

public class Demo05RandomGameTwo {


    public static void main(String[] args) {
        Random r = new Random();
        int random = r.nextInt(100) + 1; // 随机数的范围[1, 101)，随机产生的数字
        Scanner sc = new Scanner(System.in);

        // 可以猜10次，也就是循环10次
        for (int i = 1; i <= 10; i++) {
            System.out.println("请输入你猜测的数字" + "（第" + i + "次）" + "：" );
            int guessNum = sc.nextInt(); // 键盘输入的数字

            // 比较输入的数字与随机数
            if (guessNum > random) {
                System.out.println("太大了，请重新输入。");
            } else if (guessNum < random) {
                System.out.println("太小了，请重新输入。");
            } else {
                System.out.println("恭喜你，猜中了！");
                break;
            }
            // 判断当前是否为第十次，当i为10时，进行提示
            if (i == 10) {
                System.out.println("已经猜了10次，下次加油！");
            }
        }
        System.out.println("游戏结束！");
    }
}
