package xw.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
* 题目：
* 生成6个1~33之间的随机整数,添加到集合,并遍历
*
* 思路：
* 1. 需要存储6个数字，创建一个集合，<Integer>
* 2. 产生随机数，需要用到Random类
* 3. 循环6次，来产生6个随机数：for循环
* 4. 循环内调用nextInt()方法，参数是33，范围为0~32，需要整体+1，范围才是1~33
* 5. 把数字添加到集合中：add
* 6. 遍历集合：for循环，size()方法，get()方法
* */

public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        // 创建一个list集合和一个r对象
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            // 产生一个随机数
            int random = r.nextInt(33) + 1; // random随机数的范围为1~33
            // 将随机数添加到集合中
            list.add(random);
        }

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
