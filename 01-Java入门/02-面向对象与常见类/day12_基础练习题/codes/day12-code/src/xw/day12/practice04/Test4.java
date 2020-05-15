package xw.day12.practice04;

/*
 * 定义getValue方法，获取三个数中的最值，能够通过字符串，指定获取最大值或者最小值。
 *
 * 开发提示：
 * getValue中，带有String类型参数，可以指定『大』或者『小』
 * 分别定义最大值方法，最小值方法，以供getTxtValue调用。
 * */

public class Test4 {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 8, 9};

        getTxtValue("大", array);
        getTxtValue("小", array);
    }

    //  定义getTxtValue方法,参数为(String str, int n, int n2, int n3),返回值无
    public static void getTxtValue(String txt, int[] array) {
        switch (txt) {
            case "大":  // 当str为大时,调用getMax方法,获取n,n2,n3中的最大值输出
                int max = getMax(array);
                System.out.println("最大值为：" + max);
                break;
            case "小":  // 当str为小时,调用getMin方法,获取n,n2,n3中的最小值输出
                int min = getMin(array);
                System.out.println("最小值为：" + min);
                break;
            default:
                System.out.println("输入有误！");
        }
    }

    // 获取最小值
    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // 获取最大值
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
