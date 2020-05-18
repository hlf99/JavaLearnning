package xw.day12.practice07;

/*
        定义add方法，可以保存元素，添加MyList尾部。
        定义remove方法，可以获取到最后添加的元素，并从MyList中移除该元素。
        定义show方法，可以展示MyList中的元素。
*/

import java.util.ArrayList;

public class MyList {
    ArrayList<Integer> m1 = new ArrayList<>();

    public MyList() {
    }

    public MyList(ArrayList<Integer> m1) {
        this.m1 = m1;
    }

    // 定义add方法，可以保存元素，添加MyList尾部
    public void add(Integer i) {
        m1.add(i);
    }

    // 定义remove方法，可以获取到最后添加的元素，并从MyList中移除该元素。
    public Integer remove() {
        Integer remove = m1.remove(m1.size() - 1);
        return remove;
    }

    // 定义show方法，可以展示MyList中的元素
    public void show() {
        System.out.println(m1);
    }
}
