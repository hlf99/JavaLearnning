package xw.day07.demo04;

import java.util.ArrayList;

/*
* 数组的长度不可以发生改变。
* 但是ArrayList集合的长度是可以随意改变的。
*
* 对于ArrayList来说，有一个尖括号<E>代表泛型。
* 泛型：也就是装在集合中的所有元素，全都是统一的类型。
* 注意：泛型只能是引用类型，不能是基本类型。
*
* 注意事项：
* 对于ArrayList集合来说，直接打印的集合得到的不是地址值，而是内容。
* 如果内容为空，则得到的是空的中括号：[]
* */

public class Demo02ArrayList {
    public static void main(String[] args) {
        // 创建了一个ArrayList集合，集合的名称为list，里面全都是String字符串类型的数据
        // 备注：从JDK 1.7+ 开始，右侧尖括号内可以不用再写数据类型，但左侧的尖括号内还是要写上集合内数据的类型
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        // 向集合中添加一些数据，需要用add()方法
        list.add("赵丽颖");
        System.out.println(list);
        list.add("刘亦菲");
        System.out.println(list);
        list.add("陈乔恩");
        System.out.println(list);

//        list.add(100);  // 错误写法，因为创建的时候尖括号泛型已经说了是字符串，添加的数据类型只能是字符串
    }
}
