package xw.API.demo04;

/*
* Calendar类的成员方法：
*   public int get(int field) 返回给定日历字段的值。
*   public void set(int field, int value) 将给定的日历字段设置为给定值。
*   public abstract void add(int field, int amount) 根据日历的规则，为给定的日历字段添加或减去指定的时间量。
*   public Date getTime() 返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。
* 成员变量的参数：
*   public static final int filed：日历类的字段，可以使用Calendar类的静态成员变量获取
*   public static final int YEAR = 1; // 年
*   public static final int MONTH = 2; // 月
*   public static final int DATE = 5; // 月中的某一天
*   public static final int DAY_OF_MONTH = 5; // 月中的某一天
*   public static final int HOUR = 10; // 时
*   public static final int MINUTE = 12; // 分
*   public static final int SECOND = 13; // 秒
* */

import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
//        demo01();
//        demo02();
//        demo03();
        demo04();
    }

    /*
    * public Date getTime() 返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。
    * 把日历对象，转换为日期对象
    * */
    private static void demo04() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }

    /*
    * public abstract void add(int field, int amount) 根据日历的规则，为给定的日历字段添加或减去指定的时间量。
    * 把指定的字段增加或减少指定的值
    * 参数：
    *   int filed：传递指定的日历字段(YEAR,MONTH...)
    *   int amount：增加/减少的值
    *       正数：增加
    *       负数：减少
    * */
    private static void demo03() {
        // 使用getInstance方法获取Calender类的子类对象
        Calendar c = Calendar.getInstance();

        // 把年增加2年
        c.add(Calendar.YEAR, 2);
        // 把月减少3个月
        c.add(Calendar.MONTH, -3);
        // 把日增加4天
        c.add(Calendar.DATE, 4);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month); // 西方的月份0-11，东方的月份1-12

//        int date = c.get(Calendar.DATE);
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);
    }

    /*
    * public void set(int field, int value) 将给定的日历字段设置为给定值。
    * 参数：
    *       int filed：传递指定的日历字段(YEAR,MONTH...)
    *       int value: 传递的字段设置的具体的值
    * */
    private static void demo02() {
        // 使用getInstance方法获取Calender类的子类对象
        Calendar c = Calendar.getInstance();

        // 设置年为9999
        c.set(Calendar.YEAR, 9999);
        // 设置月为9
        c.set(Calendar.MONTH, 9);
        //设置日为9
        c.set(Calendar.DATE, 9);

        // 同时设置年月日，可以使用set的重载方法
        c.set(8888, 8, 8);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month); // 西方的月份0-11，东方的月份1-12

//        int date = c.get(Calendar.DATE);
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);
    }

    /*
    * public int get(int field): 返回给定日历字段的值。
    * 参数：传递指定的日历字段(YEAR,MONTH...)
    * 返回值：日历字段代表的具体的值
    * */
    private static void demo01() {
        // 使用getInstance方法获取Calender类的子类对象
        Calendar c = Calendar.getInstance();
        // 通过 类名.静态成员变量名 的方式访问Calendar中的静态成员变量
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month); // 西方的月份0-11，东方的月份1-12

        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }
}
