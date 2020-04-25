/* 
	break关键字的用法有常见的两种：
	
	1. 可以用在switch语句中，一旦执行，整个switch语句立刻结束
	2. 还可以用在循环语句中，一旦执行，整个循环语句立刻结束。打断循环。
	
	关于循环的建议：
	凡是次数确定的场景多用for循环；否则多用while1循环
 */

public class Demo14Break {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			// 如果希望从第四次开始，后续全都不要了，就要打断循环
			if (i == 4) { // 如果当前是第四次
				break;	// 那么打断整个循环
			}
			System.out.println("Hello" + i);
		}
	}
}