package xw.IOAndProperties.demo07;

/*
    java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
    Properties 类表示了一个持久的属性集。Properties可保存在流中或从流中加载。
    Properties集合是唯一一个和IO流相结合的集合
        可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
        可以使用Properties集合中的方法load，把硬盘中保存的文件(键值对)，读取到集合中使用

    属性列表中每个键及其对应的值都是一个字符串
        properties集合是一个双列集合，key和value默认都是字符串

 */

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show03();
    }

    /*
        可以使用Properties集合中的方法load，把硬盘中保存的文件(键值对)，读取到集合中使用
        void load(InputStream inStream)
        void laod(Reader reader)
        参数：
            InputStream inStream: 字节输入流，不能读取含有中文的键值对
            Reader reader: 字符输入流，能读取含有中文的键值对
        使用步骤：
            1. 创建properties集合对象
            2. 使用Properties集合对象中的方法load读取保存键值对的文件
            3. 遍历Properties集合
        注意：
            1. 存储键值对的文件中，键与值默认的连接符号可以使用=、空格、其它符号
            2. 存储键值对的文件中，可以使用#进行注释，被注释的键值对不会再被读取
            3. 存储键值对的文件中，键与值默认都是字符串，不用加引号
     */
    private static void show03() throws IOException {
        // 1. 创建properties集合对象
        Properties prop = new Properties();
        // 2. 使用Properties集合对象中的方法load读取保存键值对的文件
        // prop.load(new FileReader("E:\\JavaLearnning\\02-Java进阶\\day09_字节流、字符流\\codes\\day09-code\\prop.txt"));
        prop.load(new FileInputStream("E:\\JavaLearnning\\02-Java进阶\\day09_字节流、字符流\\codes\\day09-code\\prop.txt"));
        // 3. 遍历Properties集合
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }

    /*
        可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
        void store(OutputStream out, String comments)
        void store(Writer writer, String comments)
        参数：
            OutputStream out: 字节输出流，不能写入中文
            Writer writer: 字符输出流，可以写入中文
            String comments: 注释，用来解释说明保存的文件是做什么的
                不能使用中文，会产生乱码，默认是Unicode编码
                一般使用""空字符串
        使用步骤：
            1. 创建Properties集合对象，添加数据
            2. 创建字节/字符输出流对象，构造方法最终绑定要输出的目的地
            3. 使用properties集合中的store方法，把集合中的临时数据，持久化写入到硬盘中存储
            4. 释放资源
     */
    private static void show02() throws IOException {
        // 1. 创建Properties集合对象，添加数据
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "170");
        prop.setProperty("佟丽娅", "165");

        //2. 创建字节/字符输出流对象，构造方法最终绑定要输出的目的地
        // FileWriter fw = new FileWriter("E:\\JavaLearnning\\02-Java进阶\\day09_字节流、字符流\\codes\\day09-code\\prop.txt");

        // 3. 使用properties集合中的store方法，把集合中的临时数据，持久化写入到硬盘中存储
        // prop.store(fw, "save data");

        // 4. 释放资源
        // fw.close();

        prop.store(new FileOutputStream("E:\\JavaLearnning\\02-Java进阶\\day09_字节流、字符流\\codes\\day09-code\\prop2.txt"), "");

    }

    /*
        使用Properties集合存储数据，遍历取出Properties集合中的数据
        Properties集合是一个双列集合，key和value默认都是字符串
        Properties集合中有一些操作字符串的特有方法:
            Object setProperties(String key, String value) 调用Hashtable的方法put
            String getProperties(String key) 通过key找到value值，此方法相当于Map集合中的get(key)方法
            Set<String> stringProperties() 返回此属性列表中的键的集合，其中该键及其对应值是字符串，此方法相当于Map集合中的keySet方法
     */
    private static void show01() {
        // 创建Properties集合对象
        Properties prop = new Properties();
        // 使用setProperty()往集合中添加数据
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "170");
        prop.setProperty("佟丽娅", "165");

        // 使用stringPropertyNames()把properties集合中的键取出，存储到一个Set集合中
        Set<String> set = prop.stringPropertyNames();
        // 遍历Set集合，取出Properties集合中的每一个键
        for (String key : set) {
            // 使用getProperty()通过可以获取value
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
