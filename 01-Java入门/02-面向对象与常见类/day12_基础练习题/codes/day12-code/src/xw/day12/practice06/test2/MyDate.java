package xw.day12.practice06.test2;

/*
定义一个日期MyDate类。
    属性：
        year：年
        month：月
        day：日
    构造方法：
        无参构造方法
        满参构造方法
    成员方法：
        get/set方法
        showDate方法：打印日期。
        isBi方法：判断当前日期是否是闰年

    定义测试类，创建MyDate对象，并测试。
*/


public class MyDate {
    private int year;
    private int month;
    private int day;

    // 无参构造
    public MyDate() {

    }

    // 全参构造
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter、Setter方法
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public int getDay() {
        return day;
    }

    // 打印日期
    public void showDate() {
        System.out.println("日期：" + year + "年" + month + "月" + day + "日");
    }

    // 判断是否为闰年
    public void isBi() {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }
}
