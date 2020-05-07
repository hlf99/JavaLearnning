package xw.day09.demo04;

/*
* 在父子类的基础关系中，创建子类对象，访问成员方法的规则：
*   对象是由哪个类创建的，就优先使用谁的成员方法，没有则向上找。
*
* 注意事项：
* 无论是成员变量还是成员方法，如果在子类没有都是向上找父类，绝对不会向下找子类。
*
* 重写（Override）
* 概念：在【继承关系中】，方法的名称一样，参数列表也一样。
*
* 重写（Override）：方法的名称一样，参数列表【也一样】。也可以叫覆盖、覆写。
* 重载（Overload）：方法的名称一样，参数列表【不一样】。
* */

public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Son son = new Son();

        son.methodFather();
        son.methodSon();

        // 创建的是子类对象，所以优先使用子类方法
        son.method();
    }
}
