package xw.day12.practice06.test4;

/*
Manager类：

     属性：姓名，工号，薪资
     经理的薪资有两部分组成：基本工资+奖金
     构造方法：无参构造方法，满参构造方法
     成员方法：
     get/set方法
     intro方法：打印姓名，工号信息
     showSalary方法：打印薪资信息
     work方法：打印工作信息
*/

public class Manager {
    private String name; // 姓名
    private String id; // 工号
    private int[] salary; // 薪资

    // 无参构造方法
    public Manager() {
    }

    //全参构造方法
    public Manager(String name, String id, int[] salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter、Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int[] getSalary() {
        return salary;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }

    // intro方法：打印姓名，工号信息
    public void intro() {
        System.out.println("经理姓名：" + name);
        System.out.println("工号：" + id);
    }

    // showSalary方法：打印薪资信息
    public void showSalary() {
        System.out.println("基本工资为：" + salary[0] + "，奖金为：" + salary[1]);
    }
    // work方法：打印工作信息
    public void work() {
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
