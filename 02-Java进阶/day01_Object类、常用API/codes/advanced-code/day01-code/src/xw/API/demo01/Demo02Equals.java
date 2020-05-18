package xw.API.demo01;

/*
* Person类默认继承Object类，所以可以使用Object类的equals方法
* boolean equals(Object obj) 表示其它对象是否与此对象“相等”
*
* Object类中equals方法的源码：
*   public boolean equals(Object obj) {
        return (this == obj);
    }

    参数：
        Object obj：可以传递任意类型的对象
    方法体：
        ==：比较运算符，返回的是一个布尔值 ture/false
        基本类型：比较的值
        引用类型：比较的是两个对象的地址值
     this：哪个对象调用的方法，方法中的this指的就是哪个对象；p1调用的equals方法，所以this指的就是p1
     obj：传递过来的参数p2
     this == obj --> p1 == p2
* */

import java.util.Random;

public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴", 18);
        Person p2 = new Person("迪丽热巴", 18);
//        Person p2 = new Person("古力娜扎", 18);

//        p1 = p2;

        System.out.println("p1:" + p1); // p1:xw.API.demo01.Person@49e4cb85
        System.out.println("p2:" + p2); // p2:xw.API.demo01.Person@2133c8f8

        Random r =new Random();

//        boolean b =p1.equals(null);
        boolean b =p1.equals(p1);
        System.out.println(b); // false
    }
}
