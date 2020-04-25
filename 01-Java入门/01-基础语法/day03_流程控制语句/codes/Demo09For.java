/* 
	循环结构的基本组成部分，一般可以分为四部分：
	
	1. 初始化语句：在循环开始最初执行，而且只做唯一一次。
	2. 条件判断：如果成立，则循环继续；如果不成立，则循环退出。
	3. 循环体：重复要做的事情内容，若干条语句。
	4. 步进语句：每次循环之后都要做的扫尾工作，每次循环结束之后都要执行一次。
 */

public class Demo09For {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 100; i++) { // 此处的i++是一个单独的语句，所以前++和后++都是可以的
			System.out.println("我错啦！原谅我吧！" + i); 
			count++;
		}
		System.out.println("程序结束，总共次数为：" + count);
	}
}