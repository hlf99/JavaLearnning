package xw.day12.practice06.test3;

/*定义一个扑克Card类。
     属性：
        花色
        点数
     构造方法：
        无参构造方法
        满参构造方法
     成员方法：
        showCard方法：打印牌面信息

     定义测试类，创建Card对象，调用showCard方法。
*/

public class Card {
    // 成员变量
    private String ds; // 点数
    private String hs; // 花色

    // 无参构造方法
    public Card() {

    }

    // 全参构造方法
    public Card(String ds, String hs) {
        this.ds = ds;
        this.hs = hs;
    }

    // Getter、Setter方法
    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getHs() {
        return hs;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }

    // 打印牌面信息的方法
    public void showCard() {
        System.out.println(ds + hs);
    }
}
