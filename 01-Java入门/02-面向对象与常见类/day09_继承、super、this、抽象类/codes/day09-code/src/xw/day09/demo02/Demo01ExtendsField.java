package xw.day09.demo02;

/*
* 在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：
*
* 直接通过子类对象访问成员变量：
*   等号左边是谁，就优先用谁，没有则向上找。
*   访问成员变量的对象是哪个类创建的，就优先用哪个类中的内容，没有找到则向上找父类；如果父类中也找不到，则报错
* 间接通过成员方法访问成员变量：
*   该方法属于谁，就优先用谁，没有则向上找。
* */

public class Demo01ExtendsField {
    public static void main(String[] args) {
        Father father = new Father(); // 创建父类对象
        System.out.println(father.numFather); // 父类对象只能使用父类中的内容，不能访问子类的内容

        Son son = new Son(); // 创建子类对象
        // 子类对象既能访问子类中的内容，也能访问父类中的内容
        System.out.println(son.numFather); // 10
        System.out.println(son.numSon); // 20
        System.out.println("===============");

        System.out.println(son.num); // 优先在子类中找，200
        System.out.println("===============");

        // 这个方法是子类的，优先在子类中找，找不到再去父类中找
        son.methodSon(); // 200
        // 这个方法是在父类中定义的，应该在父类中找
        son.methodFather(); // 100
    }
}
