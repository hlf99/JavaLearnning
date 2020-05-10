package xw.day11.demo08;

/*
* 场景说明：
*     红包发出去后，所有人都有红包，大家抢完之后，最后一个红包给群主自己。
* 大多数代码是现成的，我们需要做的就是填空题。
*
* 我们自己要做的事情：
*     1. 设置一下抽象的标题，通过构造方法的字符串参数
*     2. 设置群主名字
*     3. 设置分发策略：平均，还是随机？
*
* 红包的分发策略：
*     1. 普通分发（平均）：totalMoney / totalCount，余数放在最后一个红包当中。
*     2. 手气红包（随机）：最少1分钱，最多不超过平均数的2倍。
* */

import xw.day11.red.OpenMode;
import xw.day11.red.RedPacketFrame;

public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("传智播客双元课程");
        // 设置群主名字
        red.setOwnerName("刘思聪");

        // 普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);

        // 手气红包
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }
}
