/* 
	比较运算符：
		大于：		>
		小于：		<
		大于等于：  >=
		小于等于：	<=
		等于：		==	【两个等号连起来写才是相等，一个等号代表的是赋值】
		不等于：	!=
		
	注意事项：
		1. 比较运算符的结果一定是一个boolean值，成立就是true，不成立就是false
		2. 如果进行多次判断，不能连着写
			数学中的写法： 1 < x < 3  ,在程序中是错误的
 */

public class Demo08Operator {
	public static void main(String[] args) {
		System.out.println(10 > 5); // true
		int num1 = 10;
		int num2 = 12;
		System.out.println(num1 < num2); // true
		System.out.println(num2 >= 100); // false
		System.out.println(num2 <= 100); // true
		System.out.println(num2 <= 12); // true
		System.out.println("==========");
		
		System.out.println(10 == 10); // true
		System.out.println(20 != 25); // true
		System.out.println(20 != 20); // false
		
		int x = 2;
		// System.out.println(1 < x < 3);  // 错误写法，会报错，不能连着写
	}
}