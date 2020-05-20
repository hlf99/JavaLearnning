package xw.ListAndSet.Set.demo01.HashSet;

/*
    HashSet存储自定义类型的元素

    set集合保存的元素唯一：
        存储的元素（String,Integer,...,Student,Person...），必须重写hashCode方法和equals方法

    要求：
        同名同年龄的人，视为同一人，只能存储一次
 */

import java.util.HashSet;

public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        // 创建HashSet集合存储Person对象
        HashSet<Student> set = new HashSet<>();
        Student stu1 = new Student("小美女", 18);
        Student stu2 = new Student("小美女", 18);
        Student stu3 = new Student("小美女", 19);
        System.out.println(stu1.hashCode()); // 42121758  重写hashCode方法后：734175839
        System.out.println(stu2.hashCode()); // 20671747  重写hashCode方法后：734175839

        System.out.println(stu1 == stu2); // false 比较的是两个对象的地址值  重写equals方法后：false
        System.out.println(stu1.equals(stu2)); // false 比较的是两个对象的地址值 重写equals方法后：true
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        System.out.println(set);
    }
}
