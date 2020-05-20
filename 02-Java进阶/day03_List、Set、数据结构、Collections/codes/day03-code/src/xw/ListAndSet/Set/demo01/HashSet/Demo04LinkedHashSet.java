package xw.ListAndSet.Set.demo01.HashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点：
        底层是一个哈希表（数组+链表/红黑树）+ 链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set); // [abc, www, itcast] 无序，不允许存储重复的元素

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast");
        linked.add("www");
        System.out.println(linked); // [abc, itcast, www] 有序的，不允许重复
    }
}
