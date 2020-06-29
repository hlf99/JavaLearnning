package xw.StreamAndMethodReference.demo02;

/*
    Stream流中的常用方法_concat：用于把流组合到一起
    如果有两个流，希望合并成为一个流，那么可以使用 Stream 接口的静态方法 concat
    static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
    备注：这是一个静态方法，与 java.lang.String 当中的 concat 方法是不同的。
 */

import java.util.stream.Stream;

public class Demo08Stream_concat {
    public static void main(String[] args) {
        // 创建一个Stream流
        Stream<String> streamA = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        // 获取一个Stream流
        String[] arr = {"美羊羊", "喜羊羊", "懒羊羊", "灰太狼", "红太狼"};
        Stream<String> streamB = Stream.of(arr);
        // 把以上两个流组合为一个流
        Stream<String> streamC = Stream.concat(streamA, streamB);
        // 遍历streamC流
        streamC.forEach(name -> System.out.println(name));
    }
}
