/* 
	永远停不下来的循环，叫做死循环
	
	死循环的标准格式：循环次数不确定
	while (true) {
		循环体
	}
 */

public class Demo16DeadLoop {
	public static void main(String[] args) {
		while (true) {
			System.out.println("I Love Java!");
		}
		
		// 注意：在死循环后不要写代码，否则会报错
		// System.out.println("Hello");   //  错误: 无法访问的语句
	}
}