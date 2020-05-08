package xw.day10.demo05;

public class Son extends Father {
    int num = 20;
    int age= 18;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void methodSon() {
        System.out.println("子类特有方法");
    }
}
