package xw.day12.practice05;

/*
统计高于平均分的分数有多少个。

    定义数组[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]。
    定义getAvg方法，获取一个数组中的平均数
*/


public class Test5 {
    public static void main(String[] args) {
        // 获取随机分数数组
        int[] score = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        // 获取平均分
        int avg = getAvg(score);
        // 定义一个计数器，记录大于平均数的个数
        int count = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > avg) {
                count++;
            }
        }
        // 输出平均数和大于平均数的个数
        System.out.println("高于平均分" + avg + "的个数有" + count + "个");
    }

    // 获取一个数组的平均数
    public static int getAvg(int[] arr) {
        int sum = 0;
        // 遍历数组求和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // 求平均数
        int avg = sum / arr.length;

        return avg;
    }
}
