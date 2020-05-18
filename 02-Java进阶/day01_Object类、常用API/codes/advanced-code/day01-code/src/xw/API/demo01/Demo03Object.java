package xw.API.demo01;

import java.util.Objects;

public class Demo03Object {
    public static void main(String[] args) {
//        String s1 = "abc";
        String s1 = null;
        String s2 = "abc";

//        boolean b = s1.equals(s2); // null是不能调用方法的，会抛出空指针异常（NullPointerException）
//        System.out.println(b);

        /*
            Objects类的equals方法：对两个对象进行比较，可以防止空指针异常

            public static boolean equals(Object a, Object b) {
                return (a == b) || (a != null && a.equals(b));
            }
        */

        boolean b2 = Objects.equals(s1, s2);
        System.out.println(b2);
    }
}
