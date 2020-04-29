package xw.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student(); // 无参构造
        System.out.println("=================");

        Student stu2 = new Student("赵丽颖", 20); // 全参构造
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        // 如果需要改变对象当中的成员变量的数据内容，仍然还需要使用SetXxx方法
        stu2.setAge(21); //改变年龄
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
    }
}
