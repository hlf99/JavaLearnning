package xw.day10.demo04;

/*
* 代码当中体现多态性，其实就是一句话：父类引用指向子类对象。
*
* 格式：
* 父类名称 对象名 = new 子类名称();  // 右侧子类被当做左侧父类来看待
* 或者：
* 接口名称 对象名 = new 实现类名称();
* */

public class Demo01multi {
    public static void main(String[] args) {
        // 使用多态的方法
        // 左侧父类的引用，指向了右侧子类的对象
        Father obj = new Son();

        obj.method(); // 子类方法
        obj.methodFather();
    }
}
