package xw.day12.practice02;

/*
编写步骤：

        1. 定义类 Test7
        2. 定义 main方法
        3. 定义方法printNum,在main方法中调用printNum方法
        4. printNum方法中,定义float变量f1赋值12345.01
        5. printNum方法中,定义float变量f2赋值12345.00
        6. printNum方法中,定义float 变量 var1 , 使用三元运算符赋值,当f1大于等于f2时,赋值12456 ,当f1小于f2赋值12456.02
        7. printNum方法中,定义float 变量 var2 , 保存var1 与1024的和.
        8. printNum方法中,同时输出var1,var2的值.
*/

public class Test7 {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {
        // 定义float变量f1赋值12345.01,定义float变量f2赋值12345.00
        float f1 = 12345.01F;
        float f2 = 12345.00F;

        // 定义float变量var1 , 使用三元运算符赋值,当f1大于等于f2时,赋值12456 ,当f1小于f2赋值12456.02
        float var1 = f1 >= f2 ? 123456F : 12456.02F;

        // 定义float 变量 var2 , 保存var1 与1024的和.
        float var2 = var1 + 1024;

        // 输出var1,var2的值.
        System.out.println("var1的值为" + var1); // 123456.0
        System.out.println("var2的值为" + var2); // 124480.0
    }
}
