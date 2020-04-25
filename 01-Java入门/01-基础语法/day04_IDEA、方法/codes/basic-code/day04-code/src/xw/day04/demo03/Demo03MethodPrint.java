package xw.day04.demo03;

/*
* 题目要求：
*   定义一个方法，用来打印指定次数的HelloWorld。
* */

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(10);
    }

    /*
    * 三要素：
    *   返回值类型：void，只是进行一大堆的打印操作，没有计算，也没有结果要告诉调用处
    *   方法名称：printCount
    *   参数列表：告诉打印的次数，int count
    * */
    public static void printCount(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println("Hello World!" + i);
        }
    }
}
