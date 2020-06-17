package xw.FileAndRecursion.demo01;

/*
    File类获取功能的方法
        public String getAbsolutePath(): 返回此File的绝对路径名字符串
        public String getPath(): 将此File转换为路径名字符串
        public String getName(): 返回由此File表示的文件或目录的名称
        public long length(): 返回由此File表示的文件的长度
 */

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();
    }

    /*
        public long length(): 返回由此File表示的文件的长度
        获取的是构造方法指定的文件的大小，以字节为单位
        注意：
            文件夹是没有大小概念的，不能获取文件的大小,但是可以获取到文件夹中文件的大小
            如果构造方法中给出的路径不存在，那么length方法返回0
     */
    private static void show04() {
        File f1 = new File("E:\\javacode\\123.java");
        long len1 = f1.length();
        System.out.println(len1); // 104

        File f2 = new File("E:\\javacode\\456.java");
        long len2 = f2.length();
        System.out.println(len2); // 0

        File f3 = new File("E:\\javacode");
        System.out.println(f3.length()); // 16384
    }

    /*
        public String getName(): 返回由此File表示的文件或目录的名称
     */
    private static void show03() {
        File f1 = new File("E:\\JavaLearnning\\02-Java进阶\\day01_Object类、常用API\\codes\\advanced-code\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1); // a.txt

        File f2 = new File("E:\\JavaLearnning\\02-Java进阶\\day01_Object类、常用API\\codes\\advanced-code");
        String name2 = f2.getName();
        System.out.println(name2); // advanced-code
    }

    /*
        public String getPath(): 将此File转换为路径名字符串
        获取构造方法中传递的路径
            构造方法中传入的是绝对路径，获取到的就是绝对路径
            构造方法中传入的是相对路径，获取到的就是相对路径

        toString 方法调用的就是getPath方法
        源码：
            public String toString() {
                return getPath();
            }
     */
    private static void show02() {
        File f1 = new File("E:\\JavaLearnning\\02-Java进阶\\day01_Object类、常用API\\codes\\advanced-code\\a.txt");
        String path1 = f1.getPath();
        System.out.println(path1); // E:\JavaLearnning\02-Java进阶\day01_Object类、常用API\codes\advanced-code\a.txt

        File f2 = new File("a.txt");
        String path2 = f2.getPath();
        System.out.println(path2); // a.txt

        System.out.println(f1); // E:\JavaLearnning\02-Java进阶\day01_Object类、常用API\codes\advanced-code\a.txt
        System.out.println(f1.toString()); // E:\JavaLearnning\02-Java进阶\day01_Object类、常用API\codes\advanced-code\a.txt
    }

    /*
        public String getAbsolutePath(): 返回此File的绝对路径名字符串
        获取构造方法中传递的路径
        无论路径是绝对的还是相对的，getAbsolutePath方法返回的都是绝对路径
     */
    private static void show01() {
        // 此处使用的是该项目的根目录
        File f1 = new File("E:\\JavaLearnning\\02-Java进阶\\day01_Object类、常用API\\codes\\advanced-code\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1); // E:\JavaLearnning\02-Java进阶\day01_Object类、常用API\codes\advanced-code\a.txt

        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2); // E:\JavaLearnning\02-Java进阶\day01_Object类、常用API\codes\advanced-code\a.txt
    }
}
