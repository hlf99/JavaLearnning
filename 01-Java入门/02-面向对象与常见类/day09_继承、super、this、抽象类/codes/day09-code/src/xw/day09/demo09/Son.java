package xw.day09.demo09;

/*
* super关键字用来访问父类内容，而this关键字用来访问本类内容。用法也有三种：
*
* 1. 在本类的成员方法中，访问本类的成员变量。
* 2. 在本类的成员方法中，访问本类的另一个成员方法。
* 3. 在本类的构造方法中，访问本类的另一个构造方法。
* 在第三种用法中要注意：
* A. this(...)调用也必须是构造方法的第一条语句，并且是唯一一个
* B. super和this两种构造调用，不能同时使用。
* */

public class Son extends Father {
    int num = 20;

    public Son() {
//        super(); // 使用了this后，这一行不再赠送
        this(10); // 本类的无参构造，调用本类的有参构造
//        this(1, 2); // 错误写法
    }

    public Son(int n) {
        this(1, 2);
    }

    public Son(int n, int m) {

    }

    public void showNum() {
        int num = 10;
        System.out.println(num); // 局部变量
        System.out.println(this.num); // 本类中的成员变量
        System.out.println(super.num); // 父类中的成员变量
    }

    public void methodA() {
        System.out.println("aaa");
    }

    public void methodB() {
//        methodA(); // 可以这样调用methodA方法
        this.methodA(); // 也可以通过this关键字调用，用来强调methodA方法是本类的
        System.out.println("bbb");
    }
}
