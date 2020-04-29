package xw.day06.demo05;

/*
* 一个标准的类通常要拥有以下四个组成部分：
*
* 1. 所有成员变量都要使用private关键字修饰
* 2. 为每一个成员变量编写一对Getter/Setter方法
* 3. 编写一个无参数的构造方法
* 4. 编写一个全参数的构造方法
*
* 这样标准的的类也叫做Java Bean
* */

public class Student {
    // 成员变量
    private String name; // 姓名
    private int age; // 年龄

    // 无参构造方法
    public Student() {
    }

    // 全参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // name的Getter/Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // age的Getter/Setter方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
