package xw.day12.practice02;

/*
编写步骤：

        1. 定义类 Test9
        2. 定义 main方法
        3. 定义printString方法
        4. printString方法中,定义String 类型变量str.
        5. printString方法中,定义int类型变量num,赋为任意整数值.
        6. printString方法中,通过三元运算符,判断num为偶数,将"偶数"赋值给str,否则将"奇数"赋值给str
        7. printString方法中,输出拼接效果
*/

public class Test9 {
    public static void main(String[] args) {
        printString();
    }

    public static void printString() {
        String str;
        int num = 69;

        str = (num % 2 == 0) ? "偶数" : "奇数";
        System.out.println(num + "是" + str); // 69是奇数
    }
}
