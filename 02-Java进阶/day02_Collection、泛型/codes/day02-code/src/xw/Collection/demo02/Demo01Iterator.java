package xw.Collection.demo02;

/*
    java.util.Iterator接口：迭代器（对集合进行遍历）
    有两个常用的方法
        public boolean hasNext() 如果仍有元素可以迭代，则返回 true。
            判断集合还有没有下一个元素，有就返回true，没有就返回false
        public E next():返回迭代的下一个元素
            取出集合中的下一个元素

     Iterator迭代器是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方式比较特殊
     Collection接口中有一个方法，叫Iterator()，这个方法返回的就是迭代器的实现类对象
         Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器。

     迭代器的使用步骤（重点）：
        1. 使用集合中的方法Iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
        2. 使用Iterator接口中的hasNext方法判断还有没有下一个元素
        3. 使用Iterator就接口中的next方法取出集合中的下一个元素
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {
        // 创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        // 往集合中添加元素
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");
        coll.add("艾弗森");

        /*
            1. 使用集合中的方法Iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
            注意：
                Iterator<E接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
         */
        //    接口       <---      实现类
        Iterator<String> it = coll.iterator(); // 多态

        /*
            发现迭代器取出集合中元素的代码是重复的，所以可以使用循环进行优化
            不知道集合中有多少元素，使用while循环
            循环结束的条件就是，hasNext的返回值为false
         */

        // 2. 使用Iterator接口中的hasNext方法判断还有没有下一个元素
        while (it.hasNext()) {
            // 3. 使用Iterator就接口中的next方法取出集合中的下一个元素
            String s = it.next();
            System.out.println(s); // 姚明
        }
        System.out.println("------------------");

        // for循环不需要步进表达式，因为调用next方法时，集合的指针会自己移动
        for (Iterator<String> it2 = coll.iterator(); it2.hasNext();) {
            String s = it2.next();
            System.out.println(s);
        }
    }
}
