/* 
	赋值运算符分为：
	
	基本赋值运算符：就是一个等号“=”，代表将右侧的数据交给左侧的变量。
		int a = 30;
	
	复合赋值运算符：
		+=		a += 3  => a = a + 3 
		-=		b -= 4 	=> b = b - 4
		*=		c *= 5  => c = c * 5
		/=		d /= 6  => d = d / 6
		%=		e %= 7  => e = e % 7 
		
	注意事项：
		1. 只有变量才能使用赋值运算符，常量不能进行赋值。
		2. 复合赋值运算符其中隐含了一个强制类型转换
 */

public class Demo07Operator {
	public static void main(String[] args) {
		int a = 10;
		a += 5;
		System.out.println(a);  // 15
		
		int x = 10;
		x %= 3;
		System.out.println(x); // 1
		
		byte num = 30;
		// num = num + 5;
		// num = byte + int
		// num = int + int 
		// num = int
		// num = (byte) int  隐含的强制类型转换
		num += 5;
		System.out.println(num);  // 35
	}
}