package xw.IO.demo03;

/*
    练习：转换文件编码
        将GBK编码的文件，转换为UTF-8编码的文件

    分析：
        1. 创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称GBK(解码)
        2. 创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称UTF-8(编码)
        3. 使用InputStreamReader对象中的方法read读取文件
        4. 使用OutputStreamWriter对象中的方法write，把读取的数据写入到文件中
        5. 释放资源

 */

import java.io.*;

public class Demo04Test {
    public static void main(String[] args) throws IOException {
        // 1. 创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称GBK(解码)
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\JavaLearnning\\02-Java进阶\\day10_缓冲流、转换流、序列化流、Files\\codes\\day10-code\\我是GBK格式的文本.txt"), "GBK");
        // 2. 创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称UTF-8(编码)
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\JavaLearnning\\02-Java进阶\\day10_缓冲流、转换流、序列化流、Files\\codes\\day10-code\\我是UTF-8格式的文本.txt"), "UTF-8");
        // 3. 使用InputStreamReader对象中的方法read读取文件
        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
