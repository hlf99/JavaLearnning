package xw.IOAndProperties.demo01;

/*
    一次写多个字节的方法：
        public void write(byte[] b)：将b.length个字节从指定的字节数组写入此输出流
        public void write(byte[] b, int off, int len)：将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流

 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        // 创建FileOutputStream对象，构造方法中要绑定写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("E:\\JavaLearnning\\02-Java进阶\\day09_字节流、字符流\\codes\\day09-code\\b.txt"));
        // 调用FileOutputStream对象中的方法write，把数据写入到文件中
        // 在文件中显示100，写入3个字节
        fos.write(49); // 1
        fos.write(48); // 0
        fos.write(48); // 0

        /*
            public void write(byte[] b)：将b.length个字节从指定的字节数组写入此输出流
            一次写多个字节：
                如果写的第一个字节是正数（0-127），那么显示的时候会查询ASCII表
                如果写的第一个字节是负数，那么第一个字节和第二个字节，两个字节组成一个中文显示，查询系统默认码表（GBK）
         */
        byte[] bytes = {65, 66, 67, 68, 69}; // ABCDE
//        byte[] bytes = {-65, -66, -67, 68, 69}; // 烤紻E
        fos.write(bytes);

        /*
            public void write(byte[] b, int off, int len)：把字节数组的一部分写入文件中
                将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流
                int off: 数组的开始索引
                int len: 写几个字节
         */
        fos.write(bytes, 1, 2); // BC

        /*
            写入字符的方法：可以使用String类中的方法把字符串转换为字节数组
                byte[] getBytes() 把字符串转换为字节数组

            UTF-8编码格式中，一个汉字占3个字节
         */
        byte[] bytes2 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes2));
        fos.write(bytes2);

        // 释放资源
        fos.close();
    }
}
