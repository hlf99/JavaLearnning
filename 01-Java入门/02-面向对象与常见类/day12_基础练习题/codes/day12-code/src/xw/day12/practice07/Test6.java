package xw.day12.practice07;

/*
 * 随机生成n张扑克牌。
 *
 *   使用集合保存所有的扑克牌对象。
 *   从所有牌中，随机移除n张牌，保存到新集合。
 *   判断n的值，不能超越一副扑克牌的范围。
 * */

import java.util.ArrayList;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Card> cards1 = randomCard(n);

        // 判断cards是否为null
        if (cards1 != null) {
            System.out.println("随机" + n + "张牌:");
            for (int i = 0; i < cards1.size(); i++) {
                Card card = cards1.get(i);
                card.showCard();
            }
        } else {
            System.out.println(n + "超越范围，无法获取");
        }

        System.out.println();

        int m = 53;
        ArrayList<Card> cards2 = randomCard(m);

        // 判断cards是否为null
        if (cards2 != null) {
            System.out.println("随机" + m + "张牌:");
            for (int i = 0; i < cards2.size(); i++) {
                Card card = cards2.get(i);
                card.showCard();
            }
        } else {
            System.out.println("随机"+ m +"张牌:\r\n超越范围,无法获取");
        }

    }

    // 定义randomCard方法，从全部扑克牌中随机抽取n张
    public static ArrayList<Card> randomCard(int n) {
        // 判断传入的参数是否有效
        if (n > 52 || n < 0) {
            return null;
        }

        // 创建一个集合用来存储随机扑克
        ArrayList<Card> rList = new ArrayList<>();
        // 调用allCard方法获取全部扑克
        ArrayList<Card> cards = allCard();

        Random r = new Random();
        for (int i = 0; i < n; i++) { // 抽几张就遍历几次
            int index = r.nextInt(cards.size()); // 随机获取一个0~52的索引，取不到52
            // 根据索引移除allCard集合中对应的扑克，并将移除的扑克对象作为返回值返回
            Card rCard = cards.remove(index);
            rList.add(rCard); // 将移除的扑克对象添加到rList集合中
        }

        return rList;
    }

    // 定义allCard方法，获取全部的扑克
    public static ArrayList<Card> allCard() {
        // 创建一个集合，存储的是Card对象
        ArrayList<Card> allList = new ArrayList<>();
        // 花色数组
        String[] hs = {"黑桃", "红桃", "梅花", "方片"};
        // 点数数组
        String[] ds = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (int i = 0; i < hs.length; i++) {
            for (int j = 0; j < ds.length; j++) {
                // 创建Card对象
                Card card = new Card(ds[j], hs[i]);
                // 将对象添加到集合中
                allList.add(card);
            }
        }
        // 循环结束后allList集合中一共有52个对象

        return allList;
    }
}
