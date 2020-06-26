package xw.FunctionalInterface.demo07;

/*
    java.util.function.Function<T,R> 接口用来根据一个类型的数据得到另一个类型的数据，
        前者称为前置条件，后者称为后置条件。
    Function 接口中最主要的抽象方法为： R apply(T t) ，根据类型T的参数获取类型R的结果。
        使用的场景例如：将 String 类型转换为 Integer 类型。
 */

import java.util.function.Function;

public class Demo01Function {
    /*
        定义一个方法
        方法的参数传递一个字符串类型的整数
        方法的参数传递一个Function接口，泛型使用<String, Integer>
        使用Function接口中的方法apply，把字符串类型的整数，转换为Integer类型的整数
     */
    public static void change(String s, Function<String, Integer> fun) {
//        Integer num = fun.apply(s);
        // 将Integer类型的整数自动转换为int类型，即为自动拆箱
        int num = fun.apply(s);
        System.out.println(num);
    }

    public static void main(String[] args) {
        // 定义一个字符串类型的整数
        String s = "10010";
        // 调用change方法，传递字符串类型的整数和Lambda表达式
        change(s, (String str) -> {
            // 把字符串类型的整数，转换为Integer类型的整数并返回
            return Integer.parseInt(str);
        });

        // 优化Lambda表达式
        change(s, str -> Integer.parseInt(str));
    }
}
