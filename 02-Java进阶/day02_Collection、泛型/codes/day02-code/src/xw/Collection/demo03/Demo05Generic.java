package xw.Collection.demo03;

/*
    泛型的通配符：
        ?：代表任意的数据类型
    使用方式：
        不能创建对象使用
        只能作为方法的参数使用
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);

//        ArrayList<?> list03 = new ArrayList<?>();
    }

    /*
        定义一个方法，能遍历所有类型的ArrayList集合
        这时候我们不知道ArrayList集合使用什么数据类型，可以使用泛型的通配符?来接收数据
     */
    public static void printArray(ArrayList<?> list) {
        // 使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            // it.next()方法，取出的元素不确定，所以用Object接收，可以接收任意的数据类型
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
