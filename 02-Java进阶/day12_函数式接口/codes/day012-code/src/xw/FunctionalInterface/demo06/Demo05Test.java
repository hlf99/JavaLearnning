package xw.FunctionalInterface.demo06;

/*
    数组当中有多条“姓名+性别”的信息如下，请通过 Predicate 接口的拼装将符合要求的字符串筛选到集合
    String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
    ArrayList 中，需要同时满足两个条件：
        1. 必须为女生；
        2. 姓名为4个字。

    分析：
        1. 有两个判断条件，所以需要使用Predicate接口，对条件进行判断
        2. 必须同时满足两个条件，所以可以使用and方法连接两个判断条件
 */

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo05Test {
    /*
        定义一个方法
        方法的参数传递一个包含人员信息的数组
        传递两个Predicate接口，用于对数组中的信息进行筛选过滤
        把满足条件的信息存到ArrayList集合中并返回
     */
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        // 定义一个ArrayList集合，存储过滤之后的信息
        ArrayList<String> list = new ArrayList<>();
        // 遍历数组，获取数组中的每一条信息
        for (String s : arr) {
            // 使用Predicate接口中的方法test对获取到的字符串进行判断
            boolean b = pre1.and(pre2).test(s);
            // 对得到的布尔值进行判断
            if (b) {
                // 条件成立，两个条件都满足，把信息存储到ArrayList集合中
                list.add(s);
            }
        }
        // 把集合返回
        return list;
    }

    public static void main(String[] args) {
        // 定义一个存储信息的字符串数组
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};
        // 调用filter方法 定义一个ArrayList集合接收filter方法返回的集合
        // filter方法中传递一个字符串数组和两个Lambda表达式
        /*ArrayList<String> filterList = filter(array,(String str) -> {
            // 获取字符串中的性别，判断是否为女生
            return str.split(",")[1].equals("女");
        }, (String str) -> {
            // 获取字符串中的姓名，判断姓名是否为4个字
            return str.split(",")[0].length() == 4;
        });*/

        // 优化Lambda表达式
        ArrayList<String> filterList = filter(array,
                str -> str.split(",")[1].equals("女"),
                str -> str.split(",")[0].length() == 4
        );

        // 遍历过滤后的数组并输出
        for (String s : filterList) {
            System.out.println(s);
        }
    }
}
