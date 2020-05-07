package xw.day09.demo07;

public class Son extends Father {
    public Son() {
//        super(); // 在调用父类无参构造方法，是默认赠送的
        super(20); // 在调用父类重载的构造方法
        System.out.println("子类构造方法！");
    }

    public void method() {
//        super(); // 错误方法，只有子类构造方法，才能调用父类构造方法
    }
}
