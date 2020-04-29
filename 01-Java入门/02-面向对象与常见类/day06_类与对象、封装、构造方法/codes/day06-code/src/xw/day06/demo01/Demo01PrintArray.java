package xw.day06.demo01;

/*
 * 面向过程：当需要实现一个功能时，每一个具体的步骤都要亲力亲为，详细处理每个细节。
 * 面向对象：当需要实现一个功能时，不需要关心具体步骤，而是找一个具有该功能的人，来帮我做事。
 * */

import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};

        // 要求打印格式为：[10, 20, 30, 40, 50, 60]
        // 使用面向过程，每一个步骤细节都要亲力亲为
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("===================");

        // 使用面向对象
        // 找一个JDK给我们提供好的Arrays类
        // 其中有一个toString方法，直接能把数组变成指定格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
