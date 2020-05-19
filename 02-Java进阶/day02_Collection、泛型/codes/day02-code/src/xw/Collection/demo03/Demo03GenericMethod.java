package xw.Collection.demo03;

/*
    测试含有泛型的方法
 */

public class Demo03GenericMethod {
    public static void main(String[] args) {
        // 创建一个GenericMethod对象
        GenericMethod gm = new GenericMethod();

        /*
            调用含有泛型的方法method01
            传递什么类型，泛型就是什么类型
         */
        gm.method01("abc");
        gm.method01(10);
        gm.method01(8.9);
        gm.method01(true);
        System.out.println("===========");

        //调用含有泛型的静态方法
        gm.method02("静态方法，不推荐创建对象使用");
        // 静态方法，通过 类名.方法名(参数) 的方式世界使用
        GenericMethod.method02("静态方法");
        GenericMethod.method02(3);
    }
}
