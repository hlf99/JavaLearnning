/* 
	当数据类型不一样时，就会发生数据类型转换
	
	自动类型转换（隐式）
		1. 特点：代码不需要进行特殊处理，自动完成
		2. 规则：数据范围从小到大。与字节数不一定完全相关
	
	强制类型转换（显式）
 */

public class Demo01DataType {
	public static void main(String[] args) {
		System.out.println(1024);	// 这是一个整数，默认是int类型
		System.out.println(3.14);	// 这是一个浮点数，默认是double类型
		
		// 左边是long类型，右边是默认的int类型，左右不一样。
		// int --> long ，符合数据范围从小到大的要求
		// 这一行代码发生了自动类型转换
		long num1 = 100;
		System.out.println(num1);	// 100
		
		// float --> double
		double num2 = 2.5F;
		System.out.println(num2); // 2.5
		
		// long --> float ,范围更大的是float，符合数据范围从小到大的规则
		float num3 = 30L; 
		System.out.println(num3);  // 30.0
	}
}