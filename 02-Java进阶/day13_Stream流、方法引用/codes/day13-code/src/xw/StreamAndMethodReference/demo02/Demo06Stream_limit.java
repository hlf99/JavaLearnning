package xw.StreamAndMethodReference.demo02;

/*
    Stream流中的常用方法_limit：用于截取流中的元素
    limit方法可以对流进行截取，只取前n个。
    Stream<T> limit(long maxSize);
        参数是一个long类型的整数，如果集合当前长度大于参数则进行截取，否则不进行操作
    limit方法是一个延迟方法，只是对流中的元素进行截取，返回的是一个新的流，所以可以继续调用Stream流中的其它方法
 */

import java.util.stream.Stream;

public class Demo06Stream_limit {
    public static void main(String[] args) {
        // 创建一个字符串数组
        String[] arr = {"美羊羊", "喜羊羊", "懒羊羊", "灰太狼", "红太狼"};
        // 获取一个Stream流
        Stream<String> stream = Stream.of(arr);
        // 使用limit对Stream流中的元素进行截取，只要前3个
        Stream<String> stream2 = stream.limit(3);
        // 遍历stream2流
        stream2.forEach(name -> System.out.println(name));
    }
}
