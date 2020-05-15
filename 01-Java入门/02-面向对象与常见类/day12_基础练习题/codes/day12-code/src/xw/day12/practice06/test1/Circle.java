package xw.day12.practice06.test1;

/*定义一个圆形Circle类。
     属性：
        r：半径
     构造方法：
        无参构造方法
        满参构造方法
     成员方法：
        get/set方法
        showArea方法：打印圆形面积
        showPerimeter方法：打印圆形周长

     定义测试类，创建Circle对象，并测试。
*/

public class Circle {
    // 成员变量
    private int r;

    // 无参构造方法
    public Circle() {

    }

    // 有参构造方法
    public Circle(int r) {
        this.r = r;
    }

    // Getter/Setter方法
    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    // 求面积
    public void showArea() {
        double area = Math.round(Math.PI * r * r);
        System.out.println("半径为：" + r + "，面积为：" + area);
    }

    // 求周长
    public void showPerimeter() {
        double perimeter = Math.round(2 * Math.PI * r);
        System.out.println("半径为：" + r + "，周长为：" + perimeter);
    }
}
