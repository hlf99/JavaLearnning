package xw.IO.demo02;

/*
    文件的复制练习：一读一写

    明确：
        数据源：E:\\大前端实训\\实训大作业\\Neurosurgery\\imgs\\b2.jpg
        数据的目的地：E:\\b2.jpg

    文件的复制步骤：
        1. 创建一个字节输入流对象，构造方法中绑定要读取的数据源
        2. 创建一个字节输出流对象，构造方法中绑定要写入的目的地
        3. 使用字节输入流中的方法read读取文件
        4. 使用字节输出流中的方法write，把读取到的字节写入到目的地的文件中
        5. 释放资源

    文件的大小：343040个字节
    一次读取一个字节：9926毫秒
    使用数组缓冲流读取多个字节，写入多个字节：27毫秒
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        /*long s = System.currentTimeMillis();
        // 1. 创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("E:\\大前端实训\\实训大作业\\Neurosurgery\\imgs\\b1.jpg");
        // 2. 创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("E:\\b2.jpg");
        // 一次读取一个字节，写入一个字节的方法
        // 3. 使用字节输入流中的方法read读取文件
        int len = 0; // 记录读取的单个字节
        while ((len = fis.read()) != -1) {
            // 4. 使用字节输出流中的方法write，把读取到的字节写入到目的地的文件中
            fos.write(len);
        }
        // 5. 释放资源（先关闭写的，后关闭读的；如果写完了，肯定已经读完了）
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("共耗时：" + (e - s) + "毫秒"); // 共耗时：9448毫秒*/

        long s = System.currentTimeMillis();
        // 1. 创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("E:\\大前端实训\\实训大作业\\Neurosurgery\\imgs\\b1.jpg");
        // 2. 创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("E:\\b2.jpg");
        // 使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        // 每次读取的有效字节个数
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            // 4. 使用字节输出流中的方法write，把读取到的字节写入到目的地的文件中
            fos.write(bytes);
        }
        // 5. 释放资源（先关闭写的，后关闭读的；如果写完了，肯定已经读完了）
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("共耗时：" + (e - s) + "毫秒"); // 共耗时：44毫秒
    }
}
