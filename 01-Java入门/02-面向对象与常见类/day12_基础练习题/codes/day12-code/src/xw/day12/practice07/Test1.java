package xw.day12.practice07;

/*
随机验证码。

    随机生成十组六位字符组成的验证码。
    验证码由大小写字母、数字字符组成。

    使用字符数组保存原始字符，利用Random类生成随机索引。
*/


import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String str = verifyCode();
            System.out.println("随机验证码：" + str);
        }
    }

    // 生成随机验证码的方法
    public static String verifyCode() {
        char[] charArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
                'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        // 创建一个random对象
        Random random = new Random();
        String code = ""; // 定义一个空的字符串
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(charArr.length); // 随机数的范围(0, charArr.length]
            code += charArr[index]; // 将随机产生的字符拼接成一个6位的字符串
        }

        return code; // 将随机生成的验证码字符串返回到调用处
    }
}
