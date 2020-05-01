package xw.day07.demo04;

/*
* 题目：
* 定义一个数组，用来存储3个Person对象
*
* 数组有一个缺点：一旦创建，程序运行期间长度不可变。
* */

public class Demo01Array {
    public static void main(String[] args) {
        // 首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); // null
        }
        System.out.println("=================");

        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 28);
        Person three = new Person("玛尔扎哈", 38);
        // 将对象的地址值赋给了数组
        array[0] = one;
        array[1] = two;
        array[2] = three;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); // 打印输出的是对象的地址值
        }
        System.out.println("===================");

        for (int i = 0; i < array.length; i++) {
            System.out.println("我是：" + array[i].getName() + "，年龄：" + array[i].getAge());
        }
    }
}
