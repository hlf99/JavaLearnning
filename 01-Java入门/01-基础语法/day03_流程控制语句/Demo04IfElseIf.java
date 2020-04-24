/* 
	x和y的关系满足如下：
	如果x > 3, 那么y = 2x + 1
	如果-1 < x < 3, 那么y = 2x
	如果x <= -1, 那么y = 2x -1
 */

public class Demo04IfElseIf {
	public static void main(String[] args) {
		int x = 10;
		int y;
		if (x >= 3) {
			y = 2 * x + 1;
		} else if (x > -1 && x < 3) {
			y = 2 * x;
		} else {
			y = 2 * x - 1;
		}
		System.out.println("结果是：" + y); 
	}
}