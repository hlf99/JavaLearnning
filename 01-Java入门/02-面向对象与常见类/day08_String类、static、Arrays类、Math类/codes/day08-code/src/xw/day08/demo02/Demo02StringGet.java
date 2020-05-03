package xw.day08.demo02;

/*
* String中与获取相关的常用方法有：
*
* public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
* public String concat(String str)：将当前字符串与参数字符串拼接成为新的字符串并返回。
* public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始）
* public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有找到则返回-1
* */

public class Demo02StringGet {
    public static void main(String[] args) {
        // 获取字符串的长度
        int length = "afagtusuzbarjnkjhxahuq".length();
        System.out.println("字符串的长度是：" + length);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1); // Hello
        System.out.println(str2); // World
        System.out.println(str3); // HelloWorld

        // 获取指定位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch); // e
        System.out.println("===========");

        // 查找参数字符串在本字符串当中首次出现的索引位置，如果没有找到则返回-1
        String original = "HelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次出现的索引位置是：" + index); // 2

        System.out.println("HelloWorld".indexOf("abc")); // -1
    }
}
