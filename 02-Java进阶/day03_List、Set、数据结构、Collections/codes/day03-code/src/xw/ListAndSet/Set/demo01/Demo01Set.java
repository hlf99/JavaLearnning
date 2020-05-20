package xw.ListAndSet.Set.demo01;

/*
    java.util.Set接口 extends Collection接口
    Set接口的特点：
        1. 不允许存储重复的元素
        2. 没有索引，没有带索引的方法，也不能使用普通for循环遍历
    java.util.HashSet集合 implements Set接口
    HashSet的特点：
        1. 不允许存储重复的元素
        2. 没有索引，没有带索引的方法，也不能使用普通for循环遍历
        3. 是一个无序的集合，存储元素和取出元素的顺序可能不一致
        4. 底层是一个哈希表结构（查询速度非常快）
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // 使用add方法往集合中添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        boolean add = set.add(1);
        System.out.println(add); // false 重复的元素没有存储进去
        // 使用迭代器遍历set集合
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
        }
        System.out.println("----------------");
        // 使用增强for遍历set集合
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
