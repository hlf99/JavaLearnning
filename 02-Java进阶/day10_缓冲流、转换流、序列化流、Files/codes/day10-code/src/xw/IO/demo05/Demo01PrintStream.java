package xw.IO.demo05;

/*
    java.io.PrintStream: 打印流
        PrintStream 为其它输出流添加了功能，使它们能够方便地打印各种数据值表示形式。
    PrintStream特点：
        1. 只负责数据的输出，不负责数据额读取
        2. 与其它输出流不同，PrintStream永远不会抛出IOException
        3. 有特有的方法，print和println
            void print(任意类型的值)
            void println(任意类型的值并换行)

    构造方法：
        PrintStream(File file) 输出的目的地是一个文件
        PrintStream(OutputStream out) 输出的目的地是一个字节输出流
        PrintStream(String fileName) 输出的目的地是一个文件路径

    PrintStream extends OutputStream
    继承自父类的方法：
        public void close(): 关闭此输出流并释放与此流相关联的任何系统资源
        public void flush()：刷新此输出流并强制任何缓冲的输出字节被写出
        public void write(byte[] b)：将b.length个字节从指定的字节数组写入此输出流
        public void write(byte[] b, int off, int len)：将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流
        public abstract void write(int b)：将指定的字节写入此输出流

    注意事项：
        如果使用继承自父类的write方法写数据，那么查看数据时会查询编码表 97 -> a
        如果使用自己特有的方法print/println写数据，写的数据原样输出 a -> a

 */

import java.io.IOException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws IOException {
        // System.out.println("HelloWorld");

        // 创建打印流PrintStream对象，构造方法中绑定要输出的目的地
        PrintStream ps = new PrintStream("E:\\JavaLearnning\\02-Java进阶\\day10_缓冲流、转换流、序列化流、Files\\codes\\day10-code\\print.txt");
        // 如果使用继承自父类的write方法写数据，那么查看数据时会查询编码表 97 -> a
        ps.write(97);
        // 如果使用自己特有的方法print/println写数据，写的数据原样输出 a -> a
        ps.println(97);
        ps.println(8.8);
        ps.println("HelloWorld");
        ps.println('x');
        ps.println(true);

        // 释放资源
        ps.close();
    }
}
