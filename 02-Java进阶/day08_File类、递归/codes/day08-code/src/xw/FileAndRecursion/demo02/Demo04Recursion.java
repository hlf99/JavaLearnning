package xw.FileAndRecursion.demo02;

/*
    练习：
        递归打印多级目录
    需求：
        遍历e:\\abc文件夹，及abc文件夹的子文件夹
        e:\\abc
        e:\\abc\\abc.txt
        e:\\abc\\abc.java
        e:\\abc\\a
        e:\\abc\\a\\a.jpg
        e:\\abc\\a\\a.java
        e:\\abc\\b
        e:\\abc\\b\\b.java
        e:\\abc\\b\\b.txt
 */

import java.io.File;

public class Demo04Recursion {
    public static void main(String[] args) {
        File file = new File("e:\\abc");
        getAllFiles(file);
    }

    /*
        定义一个方法，参数传递File类型的目录
        方法中对目录进行遍历
     */
    public static void getAllFiles(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            // 对遍历得到的File对象进行判断，判断是否为文件夹
            if (f.isDirectory()) {
                // f是一个文件夹，继续遍历这个文件夹
                // 直接调用getAllFiles()方法即可，这就是递归（自己调用自己）
                getAllFiles(f);
            } else {
                // f是一个文件，直接打印即可
                System.out.println(f);
            }
        }
    }
}
