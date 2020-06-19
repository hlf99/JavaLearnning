package xw.IOAndProperties.demo05;

/*
    flush方法和close方法的区别：
        flush: 刷新缓存区，流对象可以继续使用
        close: 先刷新缓存区，然后通知系统释放资源。流对象不可以再被使用
 */

import java.io.FileWriter;
import java.io.IOException;

public class Demo02CloseAndFlush {
    public static void main(String[] args) throws IOException {
        // 1. 创建FileWriter对象，构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("E:\\JavaLearnning\\02-Java进阶\\day09_字节流、字符流\\codes\\day09-code\\e.txt");
        // 2. 使用FileWriter中的方法write，把数据写入到内存缓冲区中（存在字符转换为字节的过程）
        fw.write(97);
        fw.write(98);
        fw.write(99);
        // 3. 使用FileWriter中的方法flush，把内存缓冲区的数据，刷新到文件中
        fw.flush();
        // 刷新之后，流可以继续使用
        fw.write(100);

        // 4. 释放资源（会先把内存缓冲区的数据刷新到文件中）
        fw.close();
        // close方法之后流已经关闭，已经从内存中消失了，流不能再使用了
        // fw.write(101); // 抛出异常 java.io.IOException: Stream closed
    }
}
