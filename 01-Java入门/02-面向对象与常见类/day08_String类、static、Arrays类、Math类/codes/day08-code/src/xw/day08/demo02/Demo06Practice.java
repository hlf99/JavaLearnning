package xw.day08.demo02;

/*
 * 题目：
 * 定义一个方法，把数组{1,2,3}按照指定个格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
 *
 * 思路：
 * 1. 首先准备一个int[]数组，内容时：1、2、3
 * 2. 定义一个方法，用来将数组变为字符串
 *   三要素：
 *   返回值类型：String
 *   方法名称：fromArrayToString
 *   参数列表：int[]
 * 3. 格式：[word1#word2#word3]
 * 用到：for循环、字符串拼接、每个数组元素之前都有一个word字样、分隔使用的是#、判断是不是最后一个数组元素
 * 4. 调用方法，得到返回值，并打印结果字符串
 * */

public class Demo06Practice {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        String str = fromArrayToString(array);
        System.out.println(str); // [word1#word2#word3]
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        // 遍历数组
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str = str.concat("word" + array[i] + "]");
            } else {
                str = str.concat("word" + array[i] + "#");
            }
        }
        return str;
    }
}
