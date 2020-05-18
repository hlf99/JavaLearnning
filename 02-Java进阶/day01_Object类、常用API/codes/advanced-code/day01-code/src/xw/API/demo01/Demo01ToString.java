package xw.API.demo01;

/*
* public class Object类
* Object 是类层次结构的根（最顶层的）类。每个类都使用 Object 作为超（父）类。
* 所有对象（包括数组）都实现这个类的方法。
*
* */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01ToString {
    public static void main(String[] args) {
        /*
        * Person类默认继承Object类，所以可以使用Object类中的toString方法
        * String toString() 返回该对象的字符串表示
        * */
        Person p = new Person("张三", 18);
        String s = p.toString();
        System.out.println(s); // xw.API.demo01.Person@282ba1e | abc | Person{name=张三, age=18}

        // 直接打印对象的名字，其实就是调用对象toString方法，p 等同于 p.toString()
        System.out.println(p); // xw.API.demo01.Person@282ba1e | abc | Person{name=张三, age=18}

        /*
        * 看一个类是否重写了toString方法，直接打印这个类对应对象的名字即可
        *   如果没有重写toString方法，那么打印的就是对象的地址值（默认）
        *   如果重写了toString方法，那么就按重写的方式打印
        * */
        Random r = new Random();
        System.out.println(r); // java.util.Random@36d64342 没有重写toString()

        Scanner sc = new Scanner(System.in);
        System.out.println(sc); // java.util.Scanner[delimiters=\p{javaWhitespace}+]...  重写了toString()

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list); // [1, 2]  重写了toString()
    }
}
