package xw.ListAndSet.List.demo01;

/*
    java.util.LinkedList类 implements List接口
    LinkedList集合的特点：
        1. 底层是一个链表结构：查询慢，增删块
        2. 里面包含了大量操作首尾的的方法
        注意：使用LinkedList集合特有的方法，不能使用多态

        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。

        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。

        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。

        - public boolean isEmpty()：如果列表不包含元素，则返回true。
 */

import java.util.LinkedList;

public class Demo02LinkedList {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }

    /*
        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。相当于removeFirst方法
     */
    private static void show03() {
        // 创建LinkedList集合的对象
        LinkedList<String> linked = new LinkedList<>();
        // 使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

//        String removeFirst = linked.removeFirst();
        String removeFirst = linked.pop();
        System.out.println("被移除的第一个元素：" + removeFirst);
        String removeLast = linked.removeLast();
        System.out.println("被移除的最后一个元素：" + removeLast);
        System.out.println(linked);   // [b]
    }

    /*
        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。
     */
    private static void show02() {
        // 创建LinkedList集合的对象
        LinkedList<String> linked = new LinkedList<>();
        // 使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

//        linked.clear(); // 清空集合中的元素  再获取集合中的元素会抛出NoSuchElementException(没有元素异常)

        // public boolean isEmpty()：如果列表不包含元素，则返回true。
        if (!linked.isEmpty()) {
            String first = linked.getFirst();
            System.out.println(first);
            String last = linked.getLast();
            System.out.println(last);
        } else {
            System.out.println("集合为空，请添加元素后再获取");
        }
    }

    /*
        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。
     */
    private static void show01() {
        // 创建LinkedList集合的对象
        LinkedList<String> linked = new LinkedList<>();
        // 使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked); // [a, b, c]

        // public void addFirst(E e):将指定元素插入此列表的开头。
//        linked.addFirst("www");
        linked.push("www"); // push方法等效于addFirst方法
        System.out.println(linked); // [www, a, b, c]

        // public void addLast(E e):将指定元素添加到此列表的结尾。此方法等效于add方法
        linked.addLast("com");
        System.out.println(linked); // [www, a, b, c, com]
    }
}
