package xw.Collection.demo01;

/*
    java.util.Collection接口
        是所有单列集合的最顶层的接口，定义了所有单列集合共性的方法
        任意单列集合都可以使用Collection接口中的方法

    共性的方法：
       public boolean add(E e)：  把给定的对象添加到当前集合中 。
       public void clear() :清空集合中所有的元素。
       public boolean remove(E e): 把给定的对象在当前集合中删除。
       public boolean contains(E e): 判断当前集合中是否包含给定的对象。
       public boolean isEmpty(): 判断当前集合是否为空。
       public int size(): 返回集合中元素的个数。
       public Object[] toArray(): 把集合中的元素，存储到数组中。
*/


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Demo01Collection {
    public static void main(String[] args) {
        // 创建集合对象，可以使用多态
        // 接口指向实现类
        Collection<String> coll = new ArrayList<>();
//        Collection<String> coll = new HashSet<>();  // Set集合中不允许出现重复的元素
        System.out.println(coll); // []，不是地址值， 重写了toString方法

        /*
            public boolean add(E e)：  把给定的对象添加到当前集合中
            返回值是一个boolean值，一般都返回true,所以可以不用接收
         */
        boolean b1 = coll.add("张三");
        System.out.println("b1：" + b1); // b1：true
        System.out.println(coll); // [张三]
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        coll.add("李四");
        System.out.println(coll); // [张三, 李四, 王五, 赵六, 田七, 李四]

        /*
            public boolean remove(E e): 把给定的对象在当前集合中删除。
            返回值是一个boolean值，集合中存在元素，删除元素，返回true
                                 集合中不存在元素，删除失败，返回false
        */
        boolean b2 = coll.remove("赵六");
        System.out.println("b2：" + b2); // b2：true

        boolean b3 = coll.remove("赵四");
        System.out.println("b3：" + b3); // b3：false
        System.out.println(coll); // [张三, 李四, 王五, 田七, 李四]

        /*
            public boolean contains(E e): 判断当前集合中是否包含给定的对象。
            包含返回true
            不包含返回false
         */
        boolean b4 = coll.contains("李四");
        System.out.println("b4：" + b4); // b4：true

        boolean b5 = coll.contains("赵四");
        System.out.println("b5：" + b5); // b5：false

        /*
            public boolean isEmpty(): 判断当前集合是否为空
            集合为空返回true
            集合不为空返回false
         */
        boolean b6 = coll.isEmpty();
        System.out.println("b6：" + b6); // b6：false
        
        /*
            public int size(): 返回集合中元素的个数
         */
        int size = coll.size();
        System.out.println("size：" + size); // size：5

        /*
            public Object[] toArray(): 把集合中的元素，存储到数组中
         */
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 张三 李四 王五 田七 李四
        }
        System.out.println(); // 换行

        /*
            public void clear() :清空集合中所有的元素。但是不删除集合，集合还在
         */
        coll.clear();
        System.out.println(coll); // []
        System.out.println(coll.isEmpty()); // true
    }
}
