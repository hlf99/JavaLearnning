package xw.day04.demo04;

/*
* 题目要求：
*   比较两个数据是否相等。
*   参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型
* */

public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));
//        System.out.println(isSame((byte)15, (byte)15));

        System.out.println(isSame((short)20, (short)20));

        System.out.println(isSame(11, 23));

        System.out.println(isSame(18L, 18L));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("两个byte参数的方法执行！");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("两个short参数的方法执行！");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("两个int参数的方法执行！");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("两个long参数的方法执行！");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
