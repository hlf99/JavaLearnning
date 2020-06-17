package xw.FileAndRecursion.demo01;

/*
    File判断功能的方法
        public boolean exists(): 此File表示的文件或目录是否实际存在
        public boolean isDirectory(): 此File表示的是否为目录
        public boolean isFile(): 此FIle表示的是否为文件
 */

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    /*
        public boolean isDirectory(): 此File表示的是否为目录
            判断构造方法中给定的路径是否以文件夹结尾
                是：true
                否：false
        public boolean isFile(): 此FIle表示的是否为文件
            判断构造方法中给定的路径是否以文件结尾
                是：true
                否：false

        注意：
            电脑的硬盘只有文件/文件夹，两个方法是互斥的
            这两个方法的使用前提，路径必须是存在的，否则都返回false
     */
    private static void show02() {
        File f1 = new File("E:\\JavaLearnning\\02-Java进阶\\day01_Object类、常用API\\codes\\advanced");
        // 不存在，就没必要获取
        if (f1.exists()) {
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }
        File f2 = new File("E:\\JavaLearnning\\02-Java进阶\\day01_Object类、常用API\\codes\\advanced-code");
        if (f2.exists()) {
            System.out.println(f2.isDirectory()); // true
            System.out.println(f2.isFile()); // false
        }

        File f3 = new File("E:\\JavaLearnning\\02-Java进阶\\day01_Object类、常用API\\codes\\advanced-code\\demo.txt");
        if (f3.exists()) {
            System.out.println(f3.isDirectory()); // false
            System.out.println(f3.isFile()); // true
        }
    }

    /*
        public boolean exists(): 此File表示的文件或目录是否实际存在
        用于判断构造方法中的路径是否存在
            存在：true
            不存在：false
     */
    private static void show01() {
        File f1 = new File("E:\\JavaLearnning\\02-Java进阶\\day01_Object类、常用API\\codes\\advanced-code");
        boolean b1 = f1.exists();
        System.out.println(b1); // true

        File f2 = new File("E:\\JavaLearnning\\02-Java进阶\\day01_Object类、常用API\\codes\\advanced");
        boolean b2 = f2.exists();
        System.out.println(b2); // false

        File f3 = new File("demo.txt"); // 相对路径，在该项目的根目录下
        boolean b3 = f3.exists();
        System.out.println(b3); // true

        File f4= new File("a.txt");
        System.out.println(f4.exists()); // false
    }
}
