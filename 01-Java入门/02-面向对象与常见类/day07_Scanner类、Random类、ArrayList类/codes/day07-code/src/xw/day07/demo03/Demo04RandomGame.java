package xw.day07.demo03;

/*
* 题目：
* 用代码模拟猜数字的小游戏
*
* 思路：
* 1. 首先要产生一个随机数字，并且一旦产生不在改变。用Random的nextInt()方法。
* 2. 需要键盘输入，所以用到了Scanner
* 3. 获取键盘输入的数字，用Scanner中的nextInt()方法
* 4. 已经得到了两个数字，判断一下：
*    如果比指定数字大，提示太大了，并且重试
*    如果比指定数字小，提示太小了，并且重试
*    如果和指定数字一样大，游戏结束
* 5. 重试就是再来一次，循环次数不确定，用while(true)
*
* 题目变形：
* 猜数字的次数有限，如果没有在指定次数内猜中数字，则提示游戏失败，否则提示游戏成功；
* 当猜错后，会提示剩余猜测次数。
* */

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int random = r.nextInt(100) + 1; // 随机数的范围[1, 101)，随机产生的数字
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt(); // 键盘输入的数字

            if (guessNum > random) {
                System.out.println("太大了，请重新输入。");
            } else if (guessNum < random) {
                System.out.println("太小了，请重新输入。");
            } else {
                System.out.println("恭喜你，猜中了！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
