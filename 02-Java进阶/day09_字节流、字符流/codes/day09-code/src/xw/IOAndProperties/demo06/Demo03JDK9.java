package xw.IOAndProperties.demo06;

/*
    JDK9新特性：
    try的前面可以定义流对象
    在try后面的()中可以直接引入流对象的名称(变量名)
    在try代码块执行完毕之后，流对象也可以释放掉，不用写finally
    格式：
        A a = new A();
        B b = new B();
        try (a, b) {
            可能会产生异常的代码
        } catch(异常类变量 变量名) {
            异常的处理逻辑
        }
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03JDK9 {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("E:\\大前端实训\\实训大作业\\Neurosurgery\\imgs\\b1.jpg");
        // 2. 创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("E:\\b2.jpg");

        try (fis; fos) {
            // 一次读取一个字节，写入一个字节的方法
            // 3. 使用字节输入流中的方法read读取文件
            int len = 0; // 记录读取的单个字节
            while ((len = fis.read()) != -1) {
                // 4. 使用字节输出流中的方法write，把读取到的字节写入到目的地的文件中
                fos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // fos.write(1); // IOException: Stream Closed
    }
}
