package xw.day12.practice06.test4;

public class Test4 {
    public static void main(String[] args) {
        // 创建一个coder对象
        // 调用无参构造方法创建对象
        Coder coder = new Coder();
        // 调用Getter、Setter方法给成员变量赋值
        coder.setName("Kobe");
        coder.setId("0025");
        coder.setSalary(10000);
        // 调用成员方法
        coder.intro();
        coder.showSalary();
        coder.work();

        System.out.println("========================");
        // 创建一个manager对象
        int[] salary = {15000, 3000}; // 创建一个数组，用来存放基本工资和奖金
        // 调用全参数构造方法创建对象
        Manager manager = new Manager("James", "1060", salary);
        // 调用成员方法
        manager.intro();
        manager.showSalary();
        manager.work();
    }
}
