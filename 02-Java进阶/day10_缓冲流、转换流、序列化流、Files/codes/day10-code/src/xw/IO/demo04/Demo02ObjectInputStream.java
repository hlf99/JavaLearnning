package xw.IO.demo04;

/*
    java.io.ObjectInputStream extends Inputstream
    ObjectInputStream: 对象的反序列化流
    作用：把文件中保存的对象以流的方式读取出来使用

    构造方法：
        ObjectInputStream(InputStream in) 创建写入指定InputStream的ObjectInputStream
        参数：
            InputStream in: 字节输入流

    特有的方法：
        void readObject(Object obj): 从ObjectInputStream中读取对象

    使用步骤：
        1. 创建ObjectInputStream对象，构造方法中传递字节输入流
        2. 使用ObjectInputStream对象中的方法readObject，读取保存对象的文件
        3. 释放资源
        4. 使用读取出来的对象(打印)

     readObject方法声明抛出了ClassNotFoundException(class文件找不到异常)
     但不存在对象的class文件时抛出此异常
     反序列化的前提：
        1. 实现Serializable接口
        2. 必须存在类对应的class文件
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1. 创建ObjectInputStream对象，构造方法中传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\JavaLearnning\\02-Java进阶\\day10_缓冲流、转换流、序列化流、Files\\codes\\day10-code\\person.txt"));
        // 2. 使用ObjectInputStream对象中的方法readObject，读取保存对象的文件
        Object o = ois.readObject();
        // 3. 释放资源
        ois.close();
        // 4. 使用读取出来的对象(打印)
        System.out.println(o);
        // 向上转型，将Object类型的对象转换为Person类型的对象
        Person p = (Person) o;
        System.out.println(p.getName() + p.getAge());
    }
}
