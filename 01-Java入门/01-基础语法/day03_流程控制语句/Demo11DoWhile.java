/* 
	do-while循环的标准格式：
	
	do {
		循环体
	} while (条件判断)
		
	扩展格式：
	
	初始化语句;
	do {
		循环体;
		步进语句;
	} while (条件判断)
 */

public class Demo11DoWhile {
	public static void main(String[] args) {
		int i = 0;  // 1. 初始化语句
		
		do {
			System.out.println("原谅你啦！起来吧！地上怪凉的！" + i); // 3. 循环体
			i++;  // 4. 步进语句
		} while (i < 10);  //2. 条件判断，括号后的分号不能少
	}
}