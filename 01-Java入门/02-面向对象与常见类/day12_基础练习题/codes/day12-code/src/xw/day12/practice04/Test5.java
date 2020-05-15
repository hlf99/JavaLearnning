package xw.day12.practice04;

/*
* 定义printX方法，打印任意行的图形
* 
* 1.定义printX方法,参数为(int m) , 返回值无
* 2.printX方法中,使用for循环,初始化变量x = 1,如果x<=m进入循环,步进表达式x++
 * 3.for循环内部,再嵌套定义一套for循环,初始化变量y = 1,如果y<=m进入循环,步进表达式y++
 * 4.在内循环内部,判断x==y 或者 x+y==1+m ,则打印"O",否则打印"*"
* */

public class Test5 {
    public static void main(String[] args) {
        printX(10);
    }

    public static void printX(int m) {
        //外层循环控制行数
        for (int x = 1; x <= m; x++) {
            // 内层循环控制列数
            for (int y = 1; y <= m; y++) {
                if (x == y || x + y == m + 1) {
                    System.out.print(" O"); // 对角线位置打印O
                } else {
                    System.out.print(" *"); // 其它位置打印*
                }
            }
            System.out.println(); // 换行
        }
    } 
}
