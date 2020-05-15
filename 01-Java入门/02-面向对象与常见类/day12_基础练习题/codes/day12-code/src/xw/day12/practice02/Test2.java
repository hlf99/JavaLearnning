package xw.day12.practice02;

/*
编写步骤：

    1. 定义类 Test2
    2. 定义 main方法
    3. 定义 int类型变量i1 和 long类型变量l1
    4. 定义变量add,保存i1和l1的和,并输出.
    5. 定义 long类型变量l2 和 float类型变量f2
    6. 定义变量add2,保存l2和f2的和,并输出.
    7. 定义 int类型变量i3 和 double类型变量d3
    8. 定义变量add3,保存i3和d3的和,并输出.
    9. 定义 float类型变量f4 和 double类型变量d4
    10. 定义变量add4,保存f4和d4的和,并输出.
*/

public class Test2 {
    public static void main(String[] args) {
        // 定义 int类型变量i1 和 long类型变量l1
        int i1 = 100;
        long l1 = 200L;
        // 定义变量add,保存i1和l1的和,并输出.
        long add = i1 + l1;
        System.out.println("add的值为：" + add);

        // 定义 long类型变量l2 和 float类型变量f2
        long l2 = 1000000;
        float f2 = 0.45F;
        // 定义变量add2,保存l1和f1的和,并输出.
        float add2 = l2 + f2;
        System.out.println("add2的值为：" + add2);

        // 定义 int类型变量i3 和 double类型变量d3
        int i3 = 1000000;
        double d3 = 0.45;
        // 定义变量add3,保存i2和d1的和,并输出.
        double add3 = i3 + d3;
        System.out.println("add3的值为：" + add3);

        //定义 float类型变量f2 和 double类型变量d2
        float f4 = 1000000.789F;
        double d4 = 0.45;
        //定义变量add4,保存f2和d2的和,并输出.
        double add4 = f4 + d4;
        System.out.println("add4的值为：" + add4);


        /*
        运行结果：

            add的值为：300
            add2的值为：1000000.44
            add3的值为：1000000.45
            add4的值为：1000001.2625
        */
    }
}
