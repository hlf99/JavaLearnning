package xw.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {40 , 5, 10, 30, 20, 10000, 150, 68};

        int max = array[0];  // 比武擂台
        // i要从1开始循环，不能自己和自己比武
        for (int i = 1; i < array.length; i++) {
            // 如果当前元素，比max更大，则留在擂台
            if (array[i] > max) {
                 max = array[i];
            }
        }
        // 谁最强，谁就最后能留在擂台
        System.out.println("最大值为：" + max);

        int min = array[0];  // 比武擂台
        // i要从1开始循环，不能自己和自己比武
        for (int i = 1; i < array.length; i++) {
            // 如果当前元素，比min更小，则留在擂台
            if (array[i] < min) {
                min = array[i];
            }
        }
        // 谁最弱，谁就最后能留在擂台
        System.out.println("最小值为：" + min);
    }
}
