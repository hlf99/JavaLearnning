package xw.FileAndRecursion.demo02;

/*
    练习：
        递归打印多级目录
    需求：
        遍历e:\\abc文件夹，及abc文件夹的子文件夹
        只要以.java结尾的文件
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

public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File("e:\\abc");
        getAllFiles(file);
    }

    /*
        定义一个方法，参数传递File类型的目录
        方法中对目录进行遍历
     */
    public static void getAllFiles(File dir) {
//        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            // 对遍历得到的File对象进行判断，判断是否为文件夹
            if (f.isDirectory()) {
                // f是一个文件夹，继续遍历这个文件夹
                // 直接调用getAllFiles()方法即可，这就是递归（自己调用自己）
                getAllFiles(f);
            } else {
                // f是一个文件，直接打印即可
                /*
                    e:\\abc\\abc.java
                    只要.java结尾的文件
                    1. 把File对象f，转换为字符串对象
                 */
//                String name = f.getName(); // abc.java
//                String path = f.getPath(); // e:\\abc\\abc.java
                String s = f.toString(); // e:\\abc\\abc.java

                // 2. 调用String类中的方法toLowerCase()将字符串转换为小写，用endsWith()判断字符串是否是以.java结尾
                boolean b = s.toLowerCase().endsWith(".java");

                // 如果是以.java结尾的则输出
                if (b) {
                    System.out.println(f);
                }
            }
        }
    }
}
