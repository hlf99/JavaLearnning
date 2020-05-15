package xw.day12.practice04;

/*
编写步骤：

        1. 定义类 Test1,类中定义 main方法,定义int类型a为10, b为10.
        2. 定义printNum方法,参数为(int iVar, int iVar2),返回值无,输出iVar和iVar2的值
        3. 定义doubling方法,参数为(int r, int p),返回值无,方法内r翻倍,p翻倍,并调用printNum方法,输出r和p的值
        4. 定义doubling方法,参数为(int r),返回值int, 方法内r翻倍,返回r.
        5. main方法中,调用printNum方法,传入a,b
        6. main方法中,调用doubling方法,传入a,b
        7. main方法中,调用printNum方法,传入a,b
        8. main方法中,调用doubling方法,传入a,用a接收返回值
        9. main方法中,调用doubling方法,传入b,用b接收返回值
        10. main方法中,调用printNum方法,传入a,b
*/

public class Test1 {
    public static void main(String[] args) {
        // 定义int类型a为10, b为10
        int a = 10;
        int b =10;

        printNum(a, b); // 10, 10
        // 由于该重载方法无返回值，所以main方法下a,b的值不变
        doubling(a, b); // 20, 20
        printNum(a, b); // 10, 10

        // 但是在该重载方法中有返回值，并将返回值赋给了main方法下a,b，所以a,b的值变为接收的返回值
        a = doubling(a);
        b = doubling(b);
        printNum(a, b); // 20, 20

    }

    // 定义printNum方法,参数为(int iVar, int iVar2),返回值无,输出iVar和iVar2的值
    public static void printNum(int iVar, int iVar2) {
        System.out.println("iVar：" + iVar + " iVar2：" + iVar2);
    }

    // 定义doubling方法,参数为(int r, int p),返回值无,方法内r翻倍,p翻倍,并调用printNum方法,输出r和p的值
    public static void doubling(int r, int p) {
        r *= 2;
        p *= 2;
        System.out.println("翻倍后：" + "r：" + r + " p：" + p);
    }

    // 定义doubling方法,参数为(int r),返回值int, 方法内r翻倍,返回r
    public static int doubling(int r) {
        r *= 2;
        return r;
    }
}
