package xw.day05.demo04;

/*
* 数组可以作为方法的参数
* 当调用方法时，向方法的小括号进行传参，传递进去的其实是数组的内存地址值
* */

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println(array); // 内存地址值

        printArray(array);  // 传递进去的其实就是array当中保存的地址值
        System.out.println("========AAA========");
        printArray(array);
        System.out.println("========BBB========");
        printArray(array);
        System.out.println("========CCC========");
    }

    /*
    * 三要素：
    * 返回值类型：只是打印，不需要进行计算，也没有结果，用void
    * 方法名称：printArray
    * 参数列表：必须给我数组，我才能打印其中的元素。int[] array
    * */
    // 任何类型都可作为方法的参数，数组在这里作为方法的参数
    public static void printArray(int[] array) {
        System.out.println("方法接收的array参数其实是地址值：" + array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
