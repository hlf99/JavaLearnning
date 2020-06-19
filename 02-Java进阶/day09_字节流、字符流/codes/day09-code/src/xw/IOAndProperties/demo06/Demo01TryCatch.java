package xw.IOAndProperties.demo06;

/*
    在jdk1.7之前使用try catch finally处理流中的异常
    格式：
        try {
            可能会产生异常的代码
        } catch(异常类变量 变量名) {
            异常的处理逻辑
        } finally {
            一定会执行的代码
            资源释放
        }
 */

import java.io.FileWriter;
import java.io.IOException;

public class Demo01TryCatch {
    public static void main(String[] args) {
        // 提高变量fw的作用域，让finally可以使用
        // 变量在定义的时候，可以没有值，但是使用的时候必须有值
        // fw = new FileWriter("文件路径", true);执行失败，fw没有值，fw.close()就会报错
        FileWriter fw = null;
        try {
            // 可能会产生异常的代码
            fw = new FileWriter("w:\\JavaLearnning\\02-Java进阶\\day09_字节流、字符流\\codes\\day09-code\\g.txt", true);
            for (int i = 0; i < 10; i++) {
                fw.write("我爱你" + i + "\r\n");
            }
        } catch (IOException e) {
            // 异常的处理逻辑
            e.printStackTrace();
        } finally {
            // 一定会执行的代码
            // 创建对象失败了，fw的默认值就是null,null是不能调用方法的，会抛出NullPointerException,需要增加一个判断，fw不是null才会释放资源
            if (fw != null) {
                try {
                    // fw.close方法声明抛出了IOException异常对象，所以我们就得处理这个异常对象，要么throws，要么try...catch
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
