package xw.day07.demo05;

import java.util.ArrayList;

/*
* 题目：
* 自定义4个学生对象,添加到集合,并遍历
*
* 思路：
* 1. 自定义Student学生类，【四个部分：所有成员变量加private、无参构造方法、全参构造方法、Getter/Setter方法】
* 2. 创建一个集合，用来存储学生对象。泛型：<Student>
* 3. 根据类，创建四个学生对象
* 4. 将四个对象添加到集合中
* 5. 遍历集合：for , size(), get()
* */

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        // 创建一个list集合
        ArrayList<Student> list = new ArrayList<>();

        // 创建4个学生对象
        Student s1 = new Student("赵丽颖", 18);
        Student s2 = new Student("唐嫣", 20);
        Student s3 = new Student("景甜", 22);
        Student s4 = new Student("柳岩", 21);

        // 把学生对象添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println("姓名：" + s.getName() + "，年龄：" + s.getAge());
        }
    }
}
