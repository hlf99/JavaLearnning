package xw.day10.demo07;

public class DemoMain {
    public static void main(String[] args) {
        // 创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn(); // 开机

        // 准备一个鼠标，供电脑使用
//        Mouse mouse = new Mouse();
        // 首先进行向上转型
        USB usbMouse = new Mouse();
        // 参数是USB类型的，我正好传递进去的就是USB鼠标
        computer.useDevice(usbMouse);

        // 创建一个USB键盘
        Keyborboard keyborboard = new Keyborboard(); // 没有使用多态写法
        // 方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyborboard); // 正确写法，也发生了向上转型
        // 使用子类对象，匿名对象，也是可以的
//        computer.useDevice(new Keyborboard()); // 也是正确写法

        computer.powerOff(); // 关机
        System.out.println("==============");

        method(10.0); // 正确写法，double --> double
        method(20); // 正确写法，int --> double
        int a = 30;
        method(a); // 正确写法，int --> double
    }
    public static void method(double num) {
        System.out.println(num);
    }
}
