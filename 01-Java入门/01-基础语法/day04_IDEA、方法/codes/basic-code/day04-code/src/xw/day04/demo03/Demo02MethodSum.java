package xw.day04.demo03;

/*
* 题目要求：
*   定义一个方法，求出1-100之间所有数字的和。
* */

public class Demo02MethodSum {
    public static void main(String[] args) {
        int sum = getSum(1, 100);
        System.out.println("1-100之间所有数字的和为：" + sum);
    }

    /*
    * 三要素：
    *   返回值类型：int
    *   方法名称：getSum
    *   参数列表：int start, int end
    * */
    public static int getSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
