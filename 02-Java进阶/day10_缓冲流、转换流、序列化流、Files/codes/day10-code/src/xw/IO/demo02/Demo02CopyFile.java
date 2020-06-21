package xw.IO.demo02;

/*
    文件的复制练习：一读一写

    明确：
        数据源：E:\\大前端实训\\实训大作业\\Neurosurgery\\imgs\\b2.jpg
        数据的目的地：E:\\b2.jpg

    文件的复制步骤：
        1. 创建一个字节缓冲输入流对象，构造方法中传递字节输入流对象
        2. 创建一个字节缓冲输出流对象，构造方法中传递字节输出流对象
        3. 使用字节缓冲输入流对象中的方法read读取文件
        4. 使用字节缓冲输出流中的方法write，把读取到的数据读取到内部缓冲区中
        5. 释放资源（会先把缓冲区中的数据刷新到文件中）

    文件的大小：343040个字节
    一次读取一个字节：80毫秒
    使用数组缓冲流读取多个字节，写入多个字节：10毫秒
 */

import java.io.*;

public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        // 1. 创建一个字节缓冲输入流对象，构造方法中传递字节输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\大前端实训\\实训大作业\\Neurosurgery\\imgs\\b1.jpg"));
        // 2. 创建一个字节缓冲输出流对象，构造方法中传递字节输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\b2.jpg"));
        /*int len = 0; // 记录每次读取的字节
        // 3. 使用字节缓冲输入流对象中的方法read读取文件
        while ((len = bis.read()) != -1) {
            // 4. 使用字节缓冲输出流中的方法write，把读取到的数据读取到内部缓冲区中
            bos.write(len);
        }*/

        // 使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        // 5. 释放资源（会先把缓冲区中的数据刷新到文件中）
        bos.close();
        bis.close();

        long e = System.currentTimeMillis();
        System.out.println("共耗时：" + (e - s) + "毫秒");
    }
}
