package xw.day12.practice07;

/*
统计数字出现次数。

    定义getNumList方法，随机生成100个数字，数字范围从1到10。
    定义printCount方法，统计每个数字出现的次数并打印到控制台。
*/

import java.util.ArrayList;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = getNumList();
        // 统计1~10每个数字出现的次数
        printCount(numList);
    }

    // 定义getNumList方法，随机生成100个数字，数字范围从1到10
    public static ArrayList<Integer> getNumList() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int r = random.nextInt(10) + 1; // 生成随机数，范围在[1, 10]
            list.add(r); // 将生成的随机数放入集合
        }

        return list;
    }

    // 定义printCount方法，统计每个数字出现的次数并打印到控制台
    public static void printCount(ArrayList<Integer> list) {
        // 保存对应数字出现的次数
        int[] count = new int[10];
        for (int i = 0; i < list.size(); i++) {
            int c = list.get(i); // 获取list中的随机数
            count[c - 1]++; // 数组索引从0开始，所以要-1才能和产生的随机数对应
        }

        // 打印数字和次数
        for (int j = 0; j < count.length; j++) {
            System.out.println("数字：" + (j + 1) + " 次数：" + count[j]);
        }
    }
}
