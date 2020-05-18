package xw.day12.practice07;

/*
模拟统计班级考试分数分布情况，分别统计100-80，79-60，59-40，39-0各个阶段的人数。

    定义getScoreList方法，随机生成50个数字，数字范围从0到100。
    定义countScore方法，统计各个阶段的分数个数。
    定义printCount方法，打印各个阶段的统计结果。
*/


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        // 获取随机的50个分数的集合
        ArrayList<Integer> scoreList = getScoreList();

        // 获取各个阶段的分数个数
        ArrayList<Integer> countList = countScore(scoreList);

        // 打印统计的结果
        printCount(countList);
    }

    // 定义printCount方法，打印各个阶段的统计结果
    public static void printCount(ArrayList<Integer> countList) {
        int start = 100;
        int end = 80;
        for (int i = 0; i < countList.size(); i++) {
            Integer integer = countList.get(i);
            System.out.println(start + "分" + "--" + end + "分" + "：" + integer + "人");
            if (i == 0) {
                start -= 21;
                end -= 20;
            } else if (i == 1) {
                start -= 20;
                end -= 20;
            } else {
                start -= 20;
                end -= 40;
            }
        }
    }

    // 定义countScore方法，统计各个阶段的分数个数。
    public static ArrayList<Integer> countScore(ArrayList<Integer> scoreList) {
        ArrayList<Integer> countList = new ArrayList<>();
        int count100 = 0;
        int count79 = 0;
        int count59 = 0;
        int count39 = 0;

        for (int i = 0; i < scoreList.size(); i++) {
            Integer score = scoreList.get(i);
            if (score >= 80) {
                count100++;
            } else if (score >= 60) {
                count79++;
            } else if (score >= 40) {
                count59++;
            } else {
                count39++;
            }
        }

        countList.add(count100);
        countList.add(count79);
        countList.add(count59);
        countList.add(count39);

        return countList;
    }

    // 定义getScoreList方法，随机生成50个数字，数字范围从0到100。
    public static ArrayList<Integer> getScoreList() {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            int x = r.nextInt(101);
            list.add(x);
        }
        return list;
    }
}
