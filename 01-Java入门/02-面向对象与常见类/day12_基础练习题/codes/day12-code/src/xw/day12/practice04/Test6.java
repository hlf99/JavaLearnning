package xw.day12.practice04;

/*
* 定义round方法，接收一位小数，实现四舍五入运算，并返回结果。
* */

public class Test6 {
    public static void main(String[] args) {
        System.out.println( 10.1 + "->"+ round(10.1)); // 10
        System.out.println( 10.4 +"->"+ round(10.4)); // 10
        System.out.println( 10.5 +"->"+ round(10.5)); // 11
        System.out.println( 10.9 +"->"+ round(10.9)); // 11
    }

    // 定义round方法,参数为(double d) , 返回值int
    public static int round(double d) {
        // round方法中,d+0.5后,转换为int类型,并返回.
        int n = (int) (d + 0.5);
        return n;
    }
}
