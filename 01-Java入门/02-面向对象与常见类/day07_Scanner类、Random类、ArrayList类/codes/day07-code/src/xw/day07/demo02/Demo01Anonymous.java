package xw.day07.demo02;

/*
* 创建对象的标准格式：
* 类名称 对象名 = new 类名称();
*
* 注意事项：匿名对象只能使用唯一的一次，下次在用的话就要重新创建一个新的对象
* 使用建议：如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象
* */

public class Demo01Anonymous {
    public static void main(String[] args) {
        // 左边的one就是对象的名字
        Person one = new Person();
        one.name = "高圆圆";
        one.showName(); // 我叫高圆圆
        System.out.println("===================");

        new Person().name = "赵又廷";
        new Person().showName(); // 我叫null
    }
}
