package xw.FunctionalInterface.demo04;

/*
    练习：求数组元素的最大值
        使用Supplier接口作为方法的参数类型，通过Lambda表达式求出int数组中的最大值
        提示：接口中的泛型使用java.lang.Integer类
 */

import java.util.function.Supplier;

public class Demo02Test {
    // 定义一个方法用于获取int类型数组中元素的最大值，方法的参数传递Supplier接口，泛型使用Integer
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        // 定义一个int类型的数组并赋值
        int[] arr = {100, 666, -50, 56, 55, 89, 28};
        // 调用getMax方法，方法的参数Supplier是一个函数式接口，所以可以传递Lambda表达式
        int maxValue = getMax(() -> {
            // 获取数组的最大值并返回
            // 定义一个变量，把数组中的第一个元素赋值给该变量，记录数组中元素的最大值
            int max = arr[0];
            // 遍历数组，获取数组中的其他元素
            for (int i = 1; i < arr.length; i++) {
                // 把当前元素和max变量比较
                if (arr[i] > max) {
                    // 如果当前元素大于max，则将当前元素赋值给max
                    max = arr[i];
                }
            }
            // 返回最大值
            return max;
        });
        System.out.println("数组中元素的最大值是：" + maxValue);
    }
}
