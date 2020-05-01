package xw.day07.demo04;

import java.util.ArrayList;

/*
* ArrayList当中的常用方法有：
*
* public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。返回值代表是否添加成功。
* 备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
* 但是对于其它集合（今后学习）来说，add添加动作不一定成功
*
* public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
*
* public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就被删除掉的元素。
*
* public int size()：获取集合的尺寸长度，返回值是结合当中包含的元素个数
* */

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        // 向集合添加元素：add()
        boolean success = list.add("柳岩");
        System.out.println(list); // 柳岩
        System.out.println("添加的动作是否成功：" + success);  // true

        list.add("高圆圆");
        list.add("陈乔恩");
        list.add("刘亦菲");
        list.add("杨幂");
        System.out.println(list); // [柳岩, 高圆圆, 陈乔恩, 刘亦菲, 杨幂]

        // 从集合中获取元素：get。索引从0开始
        String name = list.get(2);
        System.out.println("第2号索引位置：" + name);

        // 从集合中删除元素：remove。索引值从0开始
        String removed = list.remove(4);
        System.out.println("被删除的人是：" + removed);
        System.out.println(list); // [柳岩, 高圆圆, 陈乔恩, 刘亦菲]

        // 获取集合的长度尺寸，也就是其中元素的个数
        int size = list.size();
        System.out.println("集合的长度是：" + size);
    }
}
