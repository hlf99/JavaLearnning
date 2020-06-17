package xw.FileAndRecursion.demo01;

/*
    File类遍历(文件夹)目录功能
        public String[] list(): 返回一个String数组，表示该File目录中的所有子文件或目录
        public File[] listFiles(): 返回一个File数组，表示该File目录中的所有子文件或目录

    注意：
        list方法和listFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在，也会抛出空指针异常
        如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
        隐藏的文件/文件夹也能遍历到
 */

import java.io.File;
import java.util.Arrays;

public class Demo06File {
    public static void main(String[] args) {
        show02();
    }

    /*
        public File[] listFiles(): 返回一个File数组，表示该File目录中的所有子文件或目录
        遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹，把文件/文件夹封装为File对象，多个File对象存储到File数组最中
     */
    private static void show02() {
        File file = new File("E:\\JavaLearnning\\02-Java进阶\\day08_File类、递归\\codes\\day08-code");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    /*
        public String[] list(): 返回一个String数组，表示该File目录中的所有子文件或目录
        遍历构造方法中给出的目录，会获取到目录中所以文件/文件夹的名称，把获取到的多个名称存储到一个String类型的数组中
     */
    private static void show01() {
//        File file = new File("E:\\JavaLearnning\\02-Java进阶\\day08_File类、递归\\codes\\day08-code\\1.txt"); // NullPointerException
//        File file = new File("E:\\JavaLearnning\\02-Java进阶\\day08_File类、递归\\codes\\day08"); // NullPointerException
        File file = new File("E:\\JavaLearnning\\02-Java进阶\\day08_File类、递归\\codes\\day08-code");
        String[] arr = file.list();
        for (String fileName : arr) {
            System.out.println(fileName);
        }
    }
}
