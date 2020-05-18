package xw.API.demo06;

/*
* StringBuilder类的成员方法：
*   public StringBuilder append(...): 添加任意类型的字符串形式，并返回当前对象自身。
*   参数：
*       可以是任意的数据类型
* */

public class Demo02StringBuilder {
    public static void main(String[] args) {
        // 创建一个StringBuilder对象
        StringBuilder bu1 = new StringBuilder();
        // 使用append方法往StringBuilder中添加数据
        // append方法返回的是this，调用该方法的对象bu1
//        StringBuilder bu2 = bu1.append("abc");
//        System.out.println(bu1); // abc
//        System.out.println(bu2); // abc
//        System.out.println(bu1 == bu2); // true，两个对象时同一个对象

        // 使用append方法无需接收返回值
//        bu1.append("abc");
//        bu1.append(5);
//        bu1.append(true);
//        bu1.append(5.9);
//        bu1.append('中');
//        System.out.println(bu1); // abc5true5.9中

        /*
        * 链式编程：方法的返回值是一个对象，可以根据对象继续调用方法
        * */
        // bu1调用append方法后的返回值，还是bu1
        bu1.append("abc").append(5).append(true).append(5.9).append('中');
        System.out.println(bu1); // abc5true5.9中
    }
}
