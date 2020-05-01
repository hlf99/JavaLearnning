package xw.day07.demo03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10); // 实际范围是0~9，取不到10
            System.out.println(num);
        }
    }
}
