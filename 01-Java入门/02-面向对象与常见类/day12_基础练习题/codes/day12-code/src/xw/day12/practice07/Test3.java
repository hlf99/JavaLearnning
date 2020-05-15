package xw.day12.practice07;

/*
集合工具类。

   定义findIndex方法，在某集合中，查找某元素，返回第一次出现的索引。
   定义replace方法，将某集合中的某元素，全部替换为新元素。
*/

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {83, 72, 83, 77, 75, 72, 72, 67, 65};
        ArrayList<Integer> list = new ArrayList<>();
        // 遍历数组，将数组元素移入集合
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        // 接收返回的索引集合
        ArrayList<Integer> index = findIndex(list, 72);
        // 遍历指定数字索引的集合，获取指定数字的索引
        System.out.print("72的索引是：");
        for (int j = 0; j < index.size(); j++) {
            System.out.print(index.get(j) + " ");
        }
        System.out.println();

        System.out.print("替换前：");
        for (int m = 0; m < list.size(); m++) {
            System.out.print(list.get(m) + " ");
        }
        System.out.println();

        // 替换指定的数字为新数字
        replace(list, 72, 27);
        System.out.print("替换后：");
        for (int n = 0; n < list.size(); n++) {
            System.out.print(list.get(n) + " ");
        }
    }

    // 定义一个findIndex方法
    // 第一个参数是需要查询的集合，第二个参数是需要查找索引的数字
    public static ArrayList<Integer> findIndex(ArrayList<Integer> list, int num) {
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                index.add(i); // 将符合的数字的索引放入集合
            }
        }
        return index;
    }

    // 定义replace方法
    public static void replace(ArrayList<Integer> list, Integer oldValue, Integer newValue) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == oldValue) { // 判断当前元素是否等于指定数字
                list.set(i,newValue); // 如果是的话，就替换为新数字
            }
        }
    }
}
