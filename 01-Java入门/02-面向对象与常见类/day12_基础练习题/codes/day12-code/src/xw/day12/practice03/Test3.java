package xw.day12.practice03;

/*
编写步骤

        1. 定义类 Test3
        2. 定义 main方法
        3. 使用for循环,初始化变量r为10,当r>0时,进入循环
        4. for循环内,定义变量c,赋值为r
        5. for循环内,使用while循环,当c>=0时,输出c,再将c减2赋值给c
        6. for循环内,while循环外,r除以c赋值给r
*/

public class Test3 {
    public static void main(String[] args) {
        // 使用for循环,初始化变量r为10,当r>0时,进入循环
        for (int r = 10; r > 0; ) {
            // 定义变量c,赋值为r
            int c = r;

            // for循环内,使用while循环,当c>=0时,输出c,再将c减2赋值给c
            while (c >= 0) {
                System.out.print(c + " "); // 10 8 6 4 2 0
                c -= 2;
            }

            // for循环内,while循环外,r除以c赋值给r
            r /= c;
        }
    }
}
