package xw.day08.demo04;

/*
* 题目：
* 请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒叙打印
* */

import java.util.Arrays;

public class Demo02ArraysPractice {
    public static void main(String[] args) {
        // 创建一个随机字符串
        String str = "dfarhst15gra4r43zverjku354";

        // 将字符串转换为char[]字符数组
        char[] charArray = str.toCharArray();
        // 对数组内的所有字符进行升序排列
        Arrays.sort(charArray);

        // 倒叙遍历排好序的字符数组，并打印
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.println(charArray[i]);
        }
    }
}
