package xw.FunctionalInterface.demo05;

/*
    Consumer接口的默认方法andThen
    作用：需要两个Consumer接口，可以把两个Consumer接口组合到一起，再对数据进行消费

    例如：
    Cnosumer<String> con1
    Cnosumer<String> con2
    String s = "Hello";
    con1.accept(s);
    con2.accept(s);
    连接两个Consumer接口，再进行消费
    con1.andThen(con2).accept(s); 谁写前边谁先消费
 */

import java.util.function.Consumer;

public class Demo02AndThen {
    // 定义一个方法，方法的参数传递一个字符串和两个Consumer接口，Consumer接口的泛型使用String
    public static void method(String s, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(s);
//        con2.accept(s);
        // 连接两个Consumer接口，再进行消费
         con2.andThen(con1).accept(s); // 谁写前边谁先消费
    }

    public static void main(String[] args) {
        // 调用method方法，传递一个字符串，两个Lambda表达式
        method("Nice to meet you",
                (s) -> {
                    // 消费方式：把字符串转换为大写输出
                    System.out.println(s.toUpperCase());
                },
                (s) -> {
                    // 消费方式：把字符串转换为小写输出
                    System.out.println(s.toLowerCase());
                });
    }
}
