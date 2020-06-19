package xw.IOAndProperties.demo01;

/*
    java.io.OutputStream：字节输出流
        此抽象类是所有输出字节流的所有类的超类

    定义了一些子类共性的成员方法：
        public void close(): 关闭此输出流并释放与此流相关联的任何系统资源
        public void flush()：刷新此输出流并强制任何缓冲的输出字节被写出
        public void write(byte[] b)：将b.length个字节从指定的字节数组写入此输出流
        public void write(byte[] b, int off, int len)：将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流
        public abstract void write(int b)：将指定的字节写入此输出流

    java.io.FileOutputStream extends OutputStream
    FileOutputStream:文件字节输出流
    作用：把内存中的数据写入到硬盘的文件中

    构造方法：
        FileOutputStream(File file) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
        FileOutputStream(String name) 创建一个向具有指定名称的文件中写入数据的输出文件流。
        参数：写入数据的目的地
            String name：目的地是一个文件的路径
            File file：目的地是一个文件
        构造方法的作用：
            1. 创建一个FileOutputStream对象
            2. 会根据构造方法中传递的文件/文件路径，创建一个空的文件
            3. 会把FileOutputStream对象指向创建好的文件

    写入数据的原理（内存-->硬盘）：
        java程序-->JVM(java虚拟机)-->OS(操作系统)-->OS调用写数据的方法-->把数据写入文件中

    字节输出流的使用步骤：
        1. 创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
        2. 调用FileOutputStream对象中的方法write，把数据写入文件中
        3. 释放资源（流会占用一定的内存，使用完毕要把内存清空，提高程序的效率）
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("E:\\JavaLearnning\\02-Java进阶\\day09_字节流、字符流\\codes\\day09-code\\a.txt");
        // 2. 调用FileOutputStream对象中的方法write，把数据写入文件中
        // public abstract void write(int b)：将指定的字节写入此输出流
        fos.write(97);
        // 3. 释放资源（流会占用一定的内存，使用完毕要把内存清空，提高程序的效率）
        fos.close();
    }
}