package xw.StreamAndMethodReference.demo02;

/*
    Stream流中的常用方法_skip：用于跳过元素
    如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流
    Stream<T> skip(long n);
        如果流的当前长度大于n，则跳过前n个，否则会得到一个长度为0的空流
 */

import java.util.stream.Stream;

public class Demo07Stream_skip {
    public static void main(String[] args) {
        // 创建一个字符串数组
        String[] arr = {"美羊羊", "喜羊羊", "懒羊羊", "灰太狼", "红太狼"};
        // 获取一个Stream流
        Stream<String> stream = Stream.of(arr);
        // 使用skip方法跳过前3个元素
        Stream<String> stream2 = stream.skip(3);
        // 遍历stream2流
        stream2.forEach(name -> System.out.println(name));
    }
}
