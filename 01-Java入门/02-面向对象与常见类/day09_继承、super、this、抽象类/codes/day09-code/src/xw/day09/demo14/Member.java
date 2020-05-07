package xw.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

// 普通成员
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        // 从多个红包中随便抽取一个，给·我自己
        // 随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        // 根据索引，从集合中删除，并且得到被删除的红包，给我自己
        int delta = list.remove(index); // 获取的红包金额
        // 当前成员本来有多少钱
        int money = super.getMoney();
        // 加上红包里的钱，并且重新设置回去
        super.setMoney(money + delta);
    }
}
