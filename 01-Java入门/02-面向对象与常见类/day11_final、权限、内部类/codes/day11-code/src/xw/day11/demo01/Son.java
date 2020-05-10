package xw.day11.demo01;

public class Son extends Father {
    @Override
    public void methodAbs() {

    }

    // 错误写法，不能覆盖重写父类中final的方法
//    @Override
//    public void method() {
//        System.out.println("子类覆盖重写父类的方法");
//    }
}
