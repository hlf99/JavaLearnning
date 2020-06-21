package xw.IO.demo05;

/*
    可以改变输出语句的目的地(打印流的流向)
    输出语句，默认在控制台输出
    使用System.setOut方法将输出语句的目的地改为参数中传递的打印流的目的地
        static void setOut(PrintStream out) 重新分配“标准”输出流，即语句输出的位置
 */

import java.io.IOException;
import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String[] args) throws IOException {
        System.out.println("我是在控制台输出");
        PrintStream ps = new PrintStream("E:\\JavaLearnning\\02-Java进阶\\day10_缓冲流、转换流、序列化流、Files\\codes\\day10-code\\目的地是打印流.txt");
        System.setOut(ps); // 把输出语句的目的地改变为打印流的目的地
        System.out.println("我在打印流的目的地中输出");
    }
}
