package xw.day12.practice05;

/*
* 打印扑克牌
*
* 1. 使用两个字符串数组，分别保存花色和点数
* */

public class Test2 {
    public static void main(String[] args) {
        // 花色数组
        String[] hs = {"黑桃","红桃","梅花","方片"};
        // 点数数组
        String[] ds = {"A","2","3","4", "5","6","7","8","9","10","J","Q","K"};

        printCard(hs, ds);
    }

    public static void printCard(String[] hs, String[] ds) {
        for (int i = 0; i < hs.length; i++) { // 外层循环控制花色
            for (int j = 0; j < ds.length; j++) { // 内层循环控制点数
                // 拼接字符串
                System.out.print(hs[i] + ds[j] + " ");
            }
            System.out.println(); // 换行
        }
    }
}
