package xw.xml.jsoup;

/*
    Jsoup对象功能
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        // 2.获取Document对象，根据xml文档获取
        // 2.1 获取student.xml的path路径

        String path = JsoupDemo2.class.getClassLoader().getResource("student.xml").getPath();
        // 2.2 解析xml文档，加载文档进内存，获取dom树 --> Document
        // 方法1： 使用parse(File in, String charsetName)获取document对象
        /*Document document = Jsoup.parse(new File(path), "UTF-8");
        System.out.println(document);*/

        // 方法2： 使用parse(String html)获取document对象
        /*String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "\n" +
                " <students>\n" +
                " \t<student number=\"heima_0001\">\n" +
                "\t\t<name>tom</name>\n" +
                "\t\t<age>21</age>\n" +
                "\t\t<sex>male</sex>\n" +
                "\t</student>\n" +
                "\t<student number=\"heima_0002\">\n" +
                "\t\t<name>jack</name>\n" +
                "\t\t<age>24</age>\n" +
                "\t\t<sex>female</sex>\n" +
                "\t</student>\n";
        Document document = Jsoup.parse(str);
        System.out.println(document);*/

        // 方法3： parse​(URL url, int timeoutMillis) 通过网络路径获取指定的html或xml的文档对象
        URL url = new URL("https://baike.baidu.com/item/jsoup/9012509?fr=aladdin"); // 代表网络中的一个资源路径
        Document document = Jsoup.parse(url, 10000);
        System.out.println(document);
    }
}
