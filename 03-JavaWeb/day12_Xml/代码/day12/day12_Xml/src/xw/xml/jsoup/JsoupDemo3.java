package xw.xml.jsoup;

/*
    Document/Element对象功能
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {
        // 1.获取student.xml的path路径
        String path = JsoupDemo3.class.getClassLoader().getResource("student.xml").getPath();
        // 2.获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");

        // 3.获取元素对象
        // 3.1获取所有student对象们
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);
        System.out.println("------------------");

        // 3.2获取属性名为id的元素对象们
        Elements elements2 = document.getElementsByAttribute("id");
        System.out.println(elements2);
        System.out.println("------------------");

        // 3.3获取number属性值为heima_001的元素对象们
        Elements elements3 = document.getElementsByAttributeValue("number", "heima_0001");
        System.out.println(elements3);
        System.out.println("------------------");

        // 3.4通过id名获取元素对象
        Element itcast = document.getElementById("itcast");
        System.out.println(itcast);
    }
}
