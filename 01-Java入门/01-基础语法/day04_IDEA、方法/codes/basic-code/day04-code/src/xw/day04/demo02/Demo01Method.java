package xw.day04.demo02;

/*
* 复习之前学习的方法基础入门知识：
*
* 定义格式：
* public static void 方法名称() {
*   方法体
* }
*
* 调用格式：
* 方法名称();
*
* 注意事项：
* 1. 方法定义的先后顺序无所谓。
* 2. 方法定义必须是挨着的，不能再一个方法内部定义另一个方法。
* 3. 方法定义之后，自己不会执行；如果要执行，必须进行方法的调用
* */

public class Demo01Method {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        printMethod();
    }

    public static void printMethod() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
