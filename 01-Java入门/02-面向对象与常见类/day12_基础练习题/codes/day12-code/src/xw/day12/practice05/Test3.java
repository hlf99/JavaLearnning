package xw.day12.practice05;

/*
* 模拟在一副牌中，抽取第1张，第5张，第50张扑克牌。
* */

public class Test3 {
    public static void main(String[] args) {
        // 获取到所有的扑克牌
        String[] puke = getPuKe();

        // 抽取指定的三张扑克牌
        String[] pk3 = get3(puke, 1, 5, 54);

        // 打印抽取的牌
        for (int i = 0; i < pk3.length; i++) {
            System.out.println(pk3[i]);
        }
    }

    // 获取所有的扑克牌
    public static String[] getPuKe() {
        String[] colors={"黑桃","红桃","梅花","方块"};
        String[] nums={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        String[] puke = new String[54];
        int index = 0; // puke数组的索引
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                puke[index] = colors[i] + nums[j];
                index++;
            }
        }

        puke[52] = "小王";
        puke[53] = "大王";

        return puke;
    }

    // 获取指定的三张牌
    public static String[] get3(String[] puke, int i1, int i2, int i3) {
        String[] pk3 = new String[3];
        pk3[0] = puke[i1 -1];
        pk3[1] = puke[i2 -1];
        pk3[2] = puke[i3 -1];

        return pk3;
    }
}
