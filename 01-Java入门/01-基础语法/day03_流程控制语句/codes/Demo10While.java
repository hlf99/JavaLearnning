/* 
	while循环有一个标准格式，还有一个扩展格式
	
	标准格式：
	while (条件判断) {
		循环体
	}
	
	扩展格式：
	
	初始化语句;
	while (条件判断) {
		循环体;
		步进语句;
	}
 */

public class Demo10While {
	public static void main(String[] args) {
		int i = 0;	// 初始化语句
		while (i < 10) {	// 条件判断
			System.out.println("我错啦！原谅我吧！" + i);
			i++;  // 步进语句
		}
	}
}