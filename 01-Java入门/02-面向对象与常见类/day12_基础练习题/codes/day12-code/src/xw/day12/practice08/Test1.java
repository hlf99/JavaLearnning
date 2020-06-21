package xw.day12.practice08;

/*
    反转键盘录入的字符串。
 */

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String next = sc.next();
        System.out.println("录入的字符串：" + next);
        String s = reverseStr(next);
        System.out.println("反转的字符串：" + s);
    }

    private static String reverseStr(String next) {
        String s = "";
        char[] chars = next.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            s += chars[i];
        }
        return s;
    }
}
