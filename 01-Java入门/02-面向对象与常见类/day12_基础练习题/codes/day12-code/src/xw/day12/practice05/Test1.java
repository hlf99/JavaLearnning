package xw.day12.practice05;

/*
模拟大乐透号码：

    1. 一组大乐透号码由10个1-99之间的数字组成
    2. 定义方法，打印大乐透号码信息
*/


public class Test1 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50, 60,66,70,80,99};
        printArray(array); // 10 20 30 40 50 60 66 70 80 99
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
