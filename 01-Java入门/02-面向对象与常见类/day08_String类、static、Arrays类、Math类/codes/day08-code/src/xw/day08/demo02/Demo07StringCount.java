package xw.day08.demo02;

/*
* 题目：
* 键盘输入一个字符串，统计字符串中各种字符出现的次数。
* 种类有：大写字母、小写字母、数字、其它
*
* 思路：
* 1. 既然需要键盘输入，肯定要用Scanner
* 2. 键盘输入的是字符串，那么：String str = sc.next();
* 3. 定义四个变量，分别记录四种字符出现的次数
* 4. 需要对字符串一个字符、一个字符地检查，String-->char，所以需要转换为一个字符数组，方法是：toCharArray()
* 5. 遍历char[]字符数组，对当前字符的种类进行判断，并执行相应的++操作
* 6. 打印输出四个变量，分别代表四种字符的出现次数
* */

import java.util.Scanner;

public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();  // 获取键盘输入的字符串

        int countUpper = 0; // 大写字母
        int countLower = 0; // 小写字母
        int countNumber = 0; // 数字
        int countOther = 0; // 其它字符

        // 将输入的字符串转换为字符数组
        char[] charArray = input.toCharArray();

        // 遍历charArray字符数组
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i]; // 当前的单个字符
            // 字符在进行比较运算时，会转换为int数字
            if (ch >= 'A' && ch <= 'Z') {
                countUpper++;
            } else if (ch >= 'a' && ch <= 'z') {
                countLower++;
            } else if (ch >= '0' && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }

        // 打印输出每种字符的出现次数
        System.out.println("大写字母：" + countUpper);
        System.out.println("小写字母：" + countLower);
        System.out.println("数字：" + countNumber);
        System.out.println("其它字符：" + countOther);
    }
}
