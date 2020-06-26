package xw.FunctionalInterface.demo07;

/*
    Function接口中的默认方法andThen：用来进行组合操作

    需求：
        把String类型的"123"，转换为Integer类型，把转换后的结果加10
        把增加后的Integer类型的数据，转换为String类型

    分析：
        转换了两次
        第一次把String类型转换为Integer类型
            所以我们可以使用Function<String, Integer> fun1
                Integer i = fun1.apply("123") + 10;
        第二次是把Integer类型转换为String类型
            所以我们使用Function<Integer, String> fun2
                String s = fun2.apply(i);
        我们可以使用andThen方法，把两次转换组合在一起使用
            String s = fun1.andThen(fun2).apply("123");
            fun1先调用apply方法，将字符串转换为Integer类型
            fun2后调用apply方法，把Integer类型转换为字符串
 */

import java.util.function.Function;

public class Demo02Function_andThen {
    /*
        定义一个方法
        参数传递一个字符串类型的整数
        参数载传递两个Function接口
            一个泛型使用Function<String, Integer>  String->Integer
            一个泛型使用Function<Integer, String>  Integer->String
     */
    public static void change(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        // 定义一个字符串类型的整数
        String str = "123";
        // 调用change方法，传递字符串和两个Lambda表达式
        change(str, (String s) -> {
            // 把字符串转换为整数，然后加10
            return Integer.parseInt(s) + 10;
        }, (Integer i) -> {
            // 把整数转换为字符串
            return i + "";
        });

        // 优化Lambda表达式
        change(str, s -> Integer.parseInt(s) + 10, i -> i + "");
    }
}
