package xw.day11.demo07;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        // 左边是接口名称，右边是实现类名称，这就是多态的写法
        // List是接口，ArrayList是List接口的实现类
        List<String> list = new ArrayList<>();

        List<String> result = addName(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<String> addName(List<String> list) {
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        list.add("沙扬娜拉");
        return list;
    }
}
