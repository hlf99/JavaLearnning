package xw.day08.demo04;

/*
* 计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
*
* 思路：
* 1. 既然已经确定了范围，用for循环
* 2. 起点位置-10.8应该转换为-10，有两种方法：
*   2.1 可以使用Math.ceil()方法，向上（向正方向）取整
*   2.2 强转为int，自动舍弃所有小数部分
* 3. 每个数字都是整数，所以步进表达式应该是num++，这样每次都是+1的
* 4. 如何拿到绝对值：Math.abs()方法
* 5. 一旦发现一个数字，需要让计数器++进行统计
* */

public class Demo04MathPractice {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count = 0; // 计数器，记录符合条件的整数的个数

        // 这样处理，变量i就是区间之内所有的整数
//        for (double i = Math.ceil(min); i < max; i++) { // 使用Math.ceil()方法
        for (int i = (int) min; i < max; i++) { // 使用类型强转
//            double abs = Math.abs(i); // 绝对值
            int abs = Math.abs(i); // 绝对值
            if (abs > 6 || abs < 2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有" + count + "个数符合条件"); // 9个数
    }
}
