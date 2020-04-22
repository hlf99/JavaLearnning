/* 
	自增运算符：++
	自减运算符：--
	
	基本含义：让一个变量加一个数字1，或让一个变量减一个数字1
	使用格式：写在变量之前或之后。例如：++num、 num++
	使用方式：
		1.单独使用：不和其他操作混合，自己单独一条语句。
		2.混合使用：和其它操作混合，也就是一条语句中还有其它运算符
	使用区别：
		1.在单独使用的时候，前++和后++没有区别。也就是：++num;和num++;是完全一样的
		2.在混合使用时，有【重大区别】
			A. 如果是【前++】，那么变量【立刻马上加1】，然后拿着结果进行使用。 【先加后用】
			B. 如果是【后++】，那么首先使用变量本来的数值，【然后在让变量加1】。 【先用后加】
	注意事项：只有变量才能使用自增、自减运算符。常量不可发生改变，所以不可用。
 */

public class Demo06Operator {
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1); // 10
		++num1; // 单独使用，前++
		System.out.println(num1);  // 11
		num1++;  // 单独使用，后++
		System.out.println(num1); // 12
		System.out.println("===============");
		
		// 与打印操作混合使用
		int num2 = 20;
		// 混合使用，先++，变量立刻变为21，然后打印结果21
		System.out.println(++num2); // 21
		System.out.println(num2); // 21
		System.out.println("===============");
		
		int num3 = 30;
		// 混合使用，后++，首先使用变量本来的30，然后再让变量加1变为31
		System.out.println(num3++); // 30
		System.out.println(num3);	// 31
		System.out.println("===============");
		
		int num4 = 40;
		// 和赋值操作混合
		int result1 = --num4;	// 混合使用，前--，变量立刻-1变为39，然后将结果39赋给result1变量
		System.out.println(result1); // 39
		System.out.println(num4); // 39  
		System.out.println("===============");	

		int num5 = 50;
		int result2 = num5--; // 混合使用，后--，先将num5本来的值50赋给result2，然后再-1变为49
		System.out.println(result2); // 50
		System.out.println(num5); // 49
		System.out.println("===============");
		
		int x = 10;
		int y = 20;
		int result3 = ++x + y--;
		System.out.println(result3); // 31
		System.out.println(x); // 11
		System.out.println(y);  // 19
	}
}