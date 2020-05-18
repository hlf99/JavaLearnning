package xw.day12.practice07;

/*
自定义MyList类，实现存取元素的功能。

     定义add方法，可以保存元素，添加MyList尾部。
     定义remove方法，可以获取到最后添加的元素，并从MyList中移除该元素。
     定义show方法，可以展示MyList中的元素。
*/

public class Test7 {
    public static void main(String[] args) {
        MyList myList = new MyList();
        for (int i = 0; i < 3; i++) {
            myList.add(i);
        }
        System.out.print("添加元素后：");
        myList.show();

        Integer remove = myList.remove();
        System.out.print("获取移除的元素：");
        System.out.println(remove);

        System.out.print("移除元素后：");
        myList.show();
    }
}
