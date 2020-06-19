package xw.IOAndProperties.demo06;

/*
    JDK7的新特性：
    在try的后边可以增加一个()，在括号内可以定义流对象
    那么这个流对象的作用域就在try中有效
    try中的代码执行完毕，会自动把流对象释放，不用写finally
    格式：
        try(定义流对象;定义流对象...) {
            可能会产生异常的代码
        } catch(异常类变量 变量名) {
            异常的处理逻辑
        }
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02JDK7 {
    public static void main(String[] args) {
        try(// 1. 创建一个字节输入流对象，构造方法中绑定要读取的数据源
            FileInputStream fis = new FileInputStream("E:\\大前端实训\\实训大作业\\Neurosurgery\\imgs\\b1.jpg");
            // 2. 创建一个字节输出流对象，构造方法中绑定要写入的目的地
            FileOutputStream fos = new FileOutputStream("E:\\b2.jpg");) {

            // 可能会产生异常的代码
            // 一次读取一个字节，写入一个字节的方法
            // 3. 使用字节输入流中的方法read读取文件
            int len = 0; // 记录读取的单个字节
            while ((len = fis.read()) != -1) {
                // 4. 使用字节输出流中的方法write，把读取到的字节写入到目的地的文件中
                fos.write(len);
            }

        }catch (IOException e) {
            // 异常的处理逻辑
            e.printStackTrace();
        }

    }
}
