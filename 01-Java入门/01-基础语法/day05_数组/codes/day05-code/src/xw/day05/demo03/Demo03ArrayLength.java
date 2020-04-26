package xw.day05.demo03;

/*
* 如何获取数组的长度，格式：
* 数组名称.length
*
* 这将会得到一个int数字，代表数组的长度
*
* 数组一旦创建，程序运行期间，长度不可更改，除非重新new一个数组
*
* */

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10, 51, 131, 1, 3, 1321, 21, 3, 21, 3, 4, 44, 11, 12, 16, 17, 1, 15, 1};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度：" + len);

        int[] arrayC = new int[3];
        System.out.println(arrayC.length); // 3
        System.out.println(arrayC); // [I@27f674d
        arrayC = new int[5];
        System.out.println(arrayC.length); // 5
        System.out.println(arrayC); // [I@1d251891
        // 这里只是新数组的内存地址值替换了原数组的内存地址值，原数组的长度并没有改变
    }
}
