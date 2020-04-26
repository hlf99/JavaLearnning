package xw.day05.demo01;

/*
* 使用动态初始化数组时，其中的元素会自动拥有一个默认值。规则如下：
* 如果是整数类型，默认为0；
* 如果是浮点类型，默认为0.0；
* 如果是字符类型，默认为'\u0000'；
* 如果是布尔类型，默认为false；
* 如果是引用类型，默认为null。
*
* 注意事项：
* 静态初始化其实也有默认值的过程，只不过系统自动马上将默认值替换成了大括号中的具体数值
* */

public class Demo05ArrayUse {
    public static void main(String[] args) {
        // 动态初始化一个数组
        int[] array = new int[3];

        System.out.println(array);  // 打印输出的是：内存地址值
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 0
        System.out.println(array[2]); // 0
        System.out.println("===============");

        // 给数组当中的元素赋值
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        System.out.println(array[0]); // 10
        System.out.println(array[1]); // 20
        System.out.println(array[2]); // 30
    }
}
