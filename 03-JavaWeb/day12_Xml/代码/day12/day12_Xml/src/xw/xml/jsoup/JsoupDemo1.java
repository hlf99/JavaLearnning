package xw.xml.jsoup;

/*
    Jsoup快速入门
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        // 2.获取Document对象，根据xml文档获取
        // 2.1 获取student.xml的path路径
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        // 2.2 解析xml文档，加载文档进内存，获取dom树 --> Document
        Document document = Jsoup.parse(new File(path), "UTF-8");
        // 3.获取元素对象 Element
        Elements elements = document.getElementsByTag("name");

        System.out.println(elements.size());
        // 3.1 获取第一个name的Element对象
        Element element = elements.get(0);
        // 3.2 获取数据
        String name = element.text();
        System.out.println(name);
    }
}
