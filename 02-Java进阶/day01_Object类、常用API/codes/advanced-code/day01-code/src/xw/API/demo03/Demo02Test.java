package xw.API.demo03;

/*
* 练习：
*   请使用日期时间相关的API，计算一个人已经出生了多少天。
*
* 分析步骤：
*   1. 使用Scanner类中的方法next，获取出生日期
*   2. 使用DateFormat类中的方法parse，把字符串的出生日期解析为Date格式
*   3. 把Date格式的出生日期转换为毫秒值
*   4. 获取当前日期并转换为毫秒值
*   5. 使用当前日期的毫秒值 减去 出生日期的毫秒值
*   6. 把毫秒值得差值转换为天数（s/1000/60/60/24）
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        // 使用Scanner类中的方法next，获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式为yyyy-MM-dd");
        String birthdayDateString = sc.next();

        // 使用DateFormat类中的方法parse，把字符串的出生日期解析为Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);

        // 把Date格式的出生日期转换为毫秒值
        long birthdayDateTime = birthdayDate.getTime();

        // 获取当前日期并转换为毫秒值
        long todayTime = new Date().getTime();

        // 使用当前日期的毫秒值 减去 出生日期的毫秒值
        long time = todayTime - birthdayDateTime;

        // 把毫秒值得差值转换为天数（s/1000/60/60/24）
        long day = time / 1000 / 60 / 60 / 24;
        System.out.println("您一共经历了" + day + "天");
    }
}
