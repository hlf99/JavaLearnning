package xw.Collection.demo03;

/*
    测试含有泛型的接口
 */

public class Demo04GenericInterface {
    public static void main(String[] args) {
        // 创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gif1 = new GenericInterfaceImpl1();
        gif1.method("字符串");

        // 创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gif2 = new GenericInterfaceImpl2<>();
        gif2.method(5);

        GenericInterfaceImpl2<Double> gif3 = new GenericInterfaceImpl2<>();
        gif3.method(6.6);
    }
}
