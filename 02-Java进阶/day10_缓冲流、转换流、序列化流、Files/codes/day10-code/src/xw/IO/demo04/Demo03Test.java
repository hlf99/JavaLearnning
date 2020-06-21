package xw.IO.demo04;

/*
    练习：序列化集合
        当我们想在文件中保存多个对象时
        可以把多个对象存储到一个集合中
        对集合进行序列化和反序列化

    分析：
        1. 定义一个存储Person对象的ArrayList集合
        2. 往ArrayList集合中存储Person对象
        3. 创建一个序列化流ObjectOutputStream对象
        4. 使用ObjectOutputStream对象中的方法writeObject，对集合进行序列化，把集合存入文件中
        5. 创建一个反序列化流ObjectInputStream对象
        6. 使用ObjectInputStream对象中的方法readObject，对集合进行反序列化，读取文件中保存的集合
        7. 把Object类型的集合转换为ArrayList类型
        8. 遍历ArrayList集合
        9. 释放资源
 */

import java.io.*;
import java.util.ArrayList;

public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1. 定义一个存储Person对象的ArrayList集合
        ArrayList<Person> list = new ArrayList<>();
        // 2. 往ArrayList集合中存储Person对象
        list.add(new Person("张三", 18));
        list.add(new Person("李四", 16));
        list.add(new Person("王五", 20));
        // 3. 创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\JavaLearnning\\02-Java进阶\\day10_缓冲流、转换流、序列化流、Files\\codes\\day10-code\\list.txt"));
        // 4. 使用ObjectOutputStream对象中的方法writeObject，对集合进行序列化，把集合存入文件中
        oos.writeObject(list);
        // 5. 创建一个反序列化流ObjectInputStream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\JavaLearnning\\02-Java进阶\\day10_缓冲流、转换流、序列化流、Files\\codes\\day10-code\\list.txt"));
        //6. 使用ObjectInputStream对象中的方法readObject，对集合进行反序列化，读取文件中保存的集合
        Object o = ois.readObject();
        // 7. 把Object类型的集合转换为ArrayList类型
        ArrayList<Person> list2 = (ArrayList<Person>) o;
        // 8. 遍历ArrayList集合
        for (Person person : list2) {
            System.out.println(person);
        }
        // 9. 释放资源
        ois.close();
        oos.close();

//        System.out.println(list instanceof Object);
    }
}
