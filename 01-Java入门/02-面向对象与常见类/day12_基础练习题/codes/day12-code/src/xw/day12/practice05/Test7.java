package xw.day12.practice05;

/*
定义equals方法，比较数组内容是否完全一致。

长度一致，内容一致，定义为完全一致。
*/

public class Test7 {
    public static void main(String[] args) {
        // 创建两个数组
        int[] arr1 = {1,2,3,4,3,2,1};
        int[] arr2 = {1,2,3,4,5,2,1};

        // 比较两个数组
        System.out.println("是否一致：" + equals(arr1, arr2));
    }

    public static boolean equals(int[] arr1, int[] arr2) {
        // 长度不同,返回false
        if (arr1.length != arr2.length) {
            return false;
        }

        // 比较内容
        // 所有元素都相同才相同，也就是只要有一个不同，这两个数组就是不同
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
