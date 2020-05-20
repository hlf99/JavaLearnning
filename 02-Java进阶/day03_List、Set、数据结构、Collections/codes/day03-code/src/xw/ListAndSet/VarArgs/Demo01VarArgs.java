package xw.ListAndSet.VarArgs;

/*
    可变参数：是JDK1.5之后出现的新特性
    使用前提：
        当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
    使用格式：
        修饰符 返回值类型 方法名(数据类型...变量名) {}
    可变参数的原理：
        可变参数的底层是一个数组，根据传递参数个数的不同，会创建不同长度的数组，来存储这些参数
        传递的参数个数，可以是0个（也就是不传递），1个，2个...多个
 */

public class Demo01VarArgs {
    public static void main(String[] args) {
//        int sum = add();
//        int sum = add(10);
//        int sum = add(10, 20);
        int sum = add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        System.out.println("和为：" + sum);
    }

    /*
        可变参数的注意事项：
            1. 一个方法的参数列表，只能有一个可变参数
            2. 如果方法的参数有多个那么可变参数必须写在参数列表的末尾
     */
    /*
        public static void method(int...a, String...b) {}
        参数列表中有多个可变参数，只有末尾的可变参数才有效
     */

    /*
        public static void method(String a, double b, int...a) {}
        参数列表中有多个参数，可变参数必须放在末尾
     */

    // 可变参数的特殊（终极）写法
    public static void method(Object...obj) {

    }

    /*
        定义计算（0-n）个整数和的方法
        已知：计算整数的和，数据类型已经确定为int
        但是参数的个数不确定，不知道要计算几个整数的和，就可以使用可变参数
        add(); 就会创建一个长度为0的数组，new int[0]
        add(10); 就会创建一个长度为1的数组，new int[1]
        add(10, 20); 就会创建一个长度为2的数组，new int[2]
        add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100); 就会创建一个长度为10的数组，new int[10]
     */
    public static int add(int... arr) {
        System.out.println(arr); // [I@75412c2f 底层是一个数组
        System.out.println(arr.length); // 0, 1, 2, 10
        // 定义一个初始化变量，记录累加求和
        int sum = 0;
        for (int i : arr) {
            // 累加求和
            sum += i;
        }
        // 返回求和的结果
        return sum;
    }


    // 定义一个方法，计算两个int类型整数的和
//    public static int add(int a, int b) {
//        return a + b;
//    }
    // 定义一个方法，计算三个int类型整数的和
//    public static int add(int a, int b, int c) {
//        return a + b + c;
//    }
}
