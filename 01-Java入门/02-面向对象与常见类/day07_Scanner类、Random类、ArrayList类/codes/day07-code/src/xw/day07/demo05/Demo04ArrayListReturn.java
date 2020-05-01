package xw.day07.demo05;

/*
* 题目：
* 用一个大集合存入20个随机数，然后筛选出其中的偶数元素，放到小集合中
* 要求使用自定义的方法来实现筛选。
*
* 思路：
* 1. 需要创建一个大集合，用来存放int数字：<Integer>
* 2. 随机数需要用到Random类，使用nextInt()方法获取随机数
* 3. 循环20次，把随机数放入大集合：for循环、add()方法
* 4. 定义一个方法，用来筛选偶数
*   定义方法的三要素：
*   返回值类型：ArrayList<Integer>小集合（集合内的元素个数不确定）
*   方法名称：getEvenNum
*   参数列表：ArrayList<Integer>大集合（里面有20个随机数）
* 5. 判断（if）是否为偶数：num % 2 == 0
* 6. 如果是偶数，放入小集合，否则不放
* */

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        // 创建一个大集合
        ArrayList<Integer> listA = new ArrayList<>();
        // 创建一个r随机数对象
        Random r = new Random();
        // 循环生成20个随机数，并添加到大集合listA中
        for (int i = 0; i < 20; i++) {
            int random = r.nextInt(101); // 随机数的范围：[0, 100]
            listA.add(random);
        }

        // 打印listB小集合，也就是筛选好的集合
        ArrayList<Integer> list = getEvenNum(listA);
        System.out.println(list);
    }

    // 用来筛选偶数的方法，将大集合作为参数，小集合作为返回值
    public static ArrayList<Integer> getEvenNum(ArrayList<Integer> listA) {
        // 创建一个小集合listB，用来存放筛选好的偶数
        ArrayList<Integer> listB = new ArrayList<>();

        // 遍历大集合listA
        for (int i = 0; i < listA.size(); i++) {
            int num = listA.get(i);
            // 判断是否为偶数
            if (num % 2 == 0) {
                listB.add(num);
            }
        }

        // 将小集合listB作为返回值，返回调用处
        return listB;
    }
}
