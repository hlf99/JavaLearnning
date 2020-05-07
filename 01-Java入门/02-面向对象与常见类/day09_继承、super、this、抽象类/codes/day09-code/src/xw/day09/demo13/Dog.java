package xw.day09.demo13;

// 子类也是一个抽象类
public abstract class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    // 如果不覆盖重写的话，就会继承父类的抽象方法sleep
    // public abstract void sleep();
}
