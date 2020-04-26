package xw.day05.demo03;

/*
*  遍历数组：说的就是对数组中的每一个元素进行逐一处理。默认的处理方式就是打印输出。
* */

public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {15, 25, 29, 30, 45, 50};

        // 使用循环，循环次数就是数组的长度
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        /*
        下面的循环可以用： array.fori 来快捷生成
        for (int i = 0; i < array.length; i++) {

        }
        */
    }
}
