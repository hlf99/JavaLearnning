package xw.IO.demo01;

/*
    java.io.BufferedWriter extends Writer
    BufferedWriter: 字符缓冲输出流

    继承自父类的共性成员方法：
        - void write(int c) 写入单个字符。
        - void write(char[] cbuf)写入字符数组。
        - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        - void write(String str)写入字符串。
        - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        - void flush()刷新该流的缓冲。
        - void close() 关闭此流，但要先刷新它。

    构造方法：
        BufferedWriter(Writer out) 创建一个使用默认大小输出缓冲区的缓冲字符输出流
        BufferedWriter(Writer out, int size) 创建一个使用给定大小输出缓冲区的缓冲字符输出流
        参数：
            Writer out: 字符输出流
                我们可以传递FileWriter，缓冲流会给FileWriter增加一个缓冲区，提高FileWriter的写入效率
            int size: 指定缓冲区的大小，不写则默认

    特有的成员方法：
        void newLine() 写入一个行分隔符。会根据不同的操作系统，获取不同的行分隔符
        换行：换行符号
        windows： \r\n
        linux: \n
        mac: \r

    使用步骤：
        1. 创建字符缓冲输出流对象，构造方法中传递字符输出流对象
        2. 调用字符缓冲输出流对象中的方法write，把数据写入内存缓冲区中
        3. 调用字符缓冲区中的方法flush，把内存中的数据刷新到文件中
        4. 释放资源
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03BufferedWriter {
    public static void main(String[] args) throws IOException {
        // 1. 创建字符缓冲输出流对象，构造方法中传递字符输出流对象
        BufferedWriter fw = new BufferedWriter(new FileWriter("E:\\JavaLearnning\\02-Java进阶\\day10_缓冲流、转换流、序列化流、Files\\codes\\day10-code\\c.txt"));
        for (int i = 0; i < 10; i++) {
            // 2. 调用字符缓冲输出流对象中的方法write，把数据写入内存缓冲区中
            fw.write("春夏秋冬");
//            fw.write("\r\n");
            fw.newLine();
        }
        // 3. 调用字符缓冲区中的方法flush，把内存中的数据刷新到文件中
        fw.flush();
        // 4. 释放资源
        fw.close();
    }
}
