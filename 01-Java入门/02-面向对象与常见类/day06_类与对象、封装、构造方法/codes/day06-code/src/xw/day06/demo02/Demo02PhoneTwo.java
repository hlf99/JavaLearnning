package xw.day06.demo02;

public class Demo02PhoneTwo {
    public static void main(String[] args) {
        // 根据phone类，创建一个名为one的对象
        // 格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand); // null
        System.out.println(one.price); // 0.0
        System.out.println(one.color); // null
        System.out.println("====================");

        one.brand = "苹果";
        one.price = 8688.0;
        one.color = "黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("====================");

        one.call("乔布斯");
        one.sendMessage();

        Phone two = new Phone();
        System.out.println(two.brand); // null
        System.out.println(two.price); // 0.0
        System.out.println(two.color); // null
        System.out.println("====================");

        two.brand = "华为";
        two.price = 4600.0;
        two.color = "蓝色";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("====================");

        two.call("任正非");
        two.sendMessage();
    }
}
