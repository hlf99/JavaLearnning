package xw.day12.practice06.test5;

public class Test5 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("周老师");
        teacher.setAge(30);
        teacher.setContent("java面向对象");
        teacher.eat();
        teacher.teach();

        Student student = new Student("韩同学", 18, "java面向对象");
        student.eat();
        student.study();
    }
}
