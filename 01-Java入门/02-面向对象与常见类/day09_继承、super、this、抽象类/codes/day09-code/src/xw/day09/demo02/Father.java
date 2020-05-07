package xw.day09.demo02;

public class Father {

    int numFather = 10;

    int num = 100;

    public void methodFather() {
        // 使用的是本类中的num,不会向下找子类的
        System.out.println(num);
    }
}
