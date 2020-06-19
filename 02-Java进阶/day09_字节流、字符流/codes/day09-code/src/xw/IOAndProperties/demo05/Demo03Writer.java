package xw.IOAndProperties.demo05;

/*
    字符输出流写数据的其它方法：
        - void write(char[] cbuf)写入字符数组。
        - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        - void write(String str)写入字符串。
        - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 */

import java.io.FileWriter;
import java.io.IOException;

public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\JavaLearnning\\02-Java进阶\\day09_字节流、字符流\\codes\\day09-code\\f.txt");
        char[] cs = {'中', '国', '我', '爱', '你'};
        // void write(char[] cbuf)写入字符数组。
        fw.write(cs); // 中国我爱你

        // abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数
        fw.write(cs, 2, 3); // 我爱你

        // void write(String str)写入字符串
        fw.write("，就像老鼠爱大米");

        // void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数
        fw.write("我们不一样", 2, 3);

//        fw.flush();
        fw.close();
    }
}
