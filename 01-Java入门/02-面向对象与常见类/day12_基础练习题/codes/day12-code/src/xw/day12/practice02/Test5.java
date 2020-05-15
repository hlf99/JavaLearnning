package xw.day12.practice02;

/*
编写步骤：

        1. 定义类 Test5
        2. 定义 main方法
        3. 定义一个int类型变量a,变量b,都赋值为20.
        4. 定义boolean类型变量bo , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo
        5. 输出a的值,bo的值.
        6. 定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
        7. 输出b的值,bo2的值.
*/


public class Test5 {
    public static void main(String[] args) {
        //定义一个int类型变量a,赋值为20.
        int a = 20;
        //定义boolean类型变量bo , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo
        boolean bo = ++a % 3 == 0 && a++ % 7 == 0;
        //输出a的值,bo的值.
        System.out.println("bo的值:" + bo); // true
        System.out.println("a的值:" + a); // 22
        System.out.println("-------------");

        //定义一个int类型变量b,赋值为20.
        int b = 20;
        //定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
        boolean bo2 = b++ % 3 == 0 && ++b % 7 == 0;
        //输出b的值,bo2的值.
        System.out.println("bo2的值:" + bo2); // false
        System.out.println("b的值:" + b); // 21
    }
}
