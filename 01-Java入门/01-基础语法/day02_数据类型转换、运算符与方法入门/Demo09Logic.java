/* 
	与（并且） &&  只要有一个为false，就为false；全部都是true，才是true
	或（或者） ||  只要有一个为true,就为true；全都是false,才是false	
	非（取反）	!   本来是true，变为false；本来是false，变为true
	
	与“&&”， 或“||”，具有短路效果： 如果根据左边已经可以判断得到最终的结果，那么右边的代码将不再执行，从而节省一定的性能
	
	注意事项：
		1. 逻辑运算符只能用于boolean值
		2. 与、或需要左右各有一个boolean值，但是取反只要一个boolean值即可
		3. 与、或两种运算符，如果有多个条件，可以连续写。
		两个条件：条件A && 条件B
		多个条件：条件A && 条件B && 条件C
		
	TIPS:
	对于1 < x < 3的情况，应该拆分为两个部分，然后使用运算符连接起来：
	int x = 2;
	1 < x && x < 3
 */

public class Demo09Logic {
	public static void main(String[] args) {
		System.out.println(true && false); // false
		// true && true => true
		System.out.println(3 < 4 && 10 > 5); // true
		System.out.println("==========");
		
		System.out.println(true || false); // true
		System.out.println(true || true); // true
		System.out.println(false && false); // false
		System.out.println("==========");
		
		System.out.println(!false); // true
		System.out.println(!true); // false
		System.out.println("==========");
		
		int a = 10;
		// false && ....
		System.out.println(3 > 4 && ++a < 100);  // false，因为左侧判断为false，所以右侧不执行
		System.out.println(a); // 10
		System.out.println("==========");
		
		int b = 20;
		// true || ...
		System.out.println(3 < 4 || ++b < 100); // true，因为左侧判断为true，所以右侧不执行
		System.out.println(b); // 20
	}
}