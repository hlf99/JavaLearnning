package xw.day12.practice07;

/*
键盘录入学生信息，保存到集合中。

    循环录入的方式，1：表示继续录入，0：表示结束录入。
    定义学生类，属性为姓名，年龄，使用学生对象保存录入数据。
    使用ArrayList集合，保存学生对象，录入结束后，遍历集合。
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 创建一个scanner对象
        Scanner scanner = new Scanner(System.in);
        // 创建一个集合，用来保存学生对象
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("1.录入信息 0.退出");
            int i = scanner.nextInt(); // 键盘输入，nextInt()方法是输入数字
            switch (i) {
                case 1:
                    inputStu(list, scanner);
                    break;
                case 0:
                    System.out.println("录入完毕");
            }
            if (i == 0) {
                break; // 结束循环
            }
        }
        
        // 录入结束后，遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i); // 获取集合中的每一项，并将对象的地址值赋给stu对象
            stu.show(); // 显示集合
        }
    }

    public static void inputStu(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入姓名：");
        String name = sc.next(); // next()方法是输入字符串
        System.out.println("请输入年龄：");
        int age = sc.nextInt(); // nextInt()方法是输入数字
        Student stu = new Student(name, age); // 创建学生对象
        list.add(stu); // 将学生对象放入集合中
    }
}
