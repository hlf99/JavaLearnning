package xw.day12.practice03;

/*
编写步骤：

        1. 定义类 Test2
        2. 定义 main方法
        3. 定义变量 discount为1, totalPrice为550
        4. 判断当totalPrice >=500 ,discount赋值为0.5
        5. 判断当totalPrice >=400 且<500时,discount赋值为0.6
        6. 判断当totalPrice >=300 且<400时,discount赋值为0.7
        7. 判断当totalPrice >=200 且<300时,discount赋值为0.8
        8. 输出totalPrice.
        9. 输出totalPrice 与 discount 的积
*/

public class Test2 {
    public static void main(String[] args) {
        // 定义变量 discount为1, totalPrice为550
        double discount = 1;
        int totalPrice = 550;

        if (totalPrice >= 500) {
            discount = 0.5;
        } else if (totalPrice >= 400) {
            discount = 0.6;
        } else if (totalPrice >= 300) {
            discount = 0.7;
        } else if (totalPrice >= 200) {
            discount = 0.8;
        }
        // 输出totalPrice
        System.out.println("totalPrice：" + totalPrice);
        // 输出totalPrice 与 discount 的积
        System.out.println("totalPrice的discount：" + (totalPrice * discount));
    }
}
