package xw.IOAndProperties.demo04;

/*
    使用字节流读取中文文件
    1字节
        GBK：占用两个字节
        UTF-8：占用3个字节
 */

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\JavaLearnning\\02-Java进阶\\day09_字节流、字符流\\codes\\day09-code\\c.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println((char)len);
        }
        fis.close();
    }
}
