/* 
	强制类型转换：
		1 特点：代码需要特殊的格式处理，不能自动完成。
		2 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据
		
	注意事项：
		1 强制类型转换一般不推荐使用，因为有可能发生精度损失（对于小数）、数据溢出（对于整数）
		2 byte/short/char这三种类型可以发生数学运算，例如加法“+”
		3 byte/short/char这三种类型在运算时，都会被首先提升成为int类型，然后再运算
		4 boolean类型不能发生数据类型转换
 */

public class Demo02DataType {
	public static void main(String[] args) {
		// 左边是int类型，右边是long类型，不一样
		// long --> int ，不是范围从小到大，不能自动完成转换
		// 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据
		int num = (int) 100L;
		System.out.println(num);  // 100
		
		// long类型强制转换成int类型
		int num2 = (int) 6000000000L;
		System.out.println(num2);  // 1705032704
		
		// double --> int ，强制类型转换
		int num3 = (int) 3.99;
		System.out.println(num3); // 3，这并不是四舍五入，所有的小数位都会被舍弃掉
		
		char zifu1 = 'A'; // 这是一个字符型变量，里面是大写字母A
		System.out.println(zifu1 + 1);  // 66，也就是A被当做是65进行计算
		// 计算机的底层会用一个数字（二进制）来代表字符A，也就是65
		// 一旦char类型进行了数学运算，那么字符就会按照一定的规则翻译成一个数字
		
		byte num4 = 40;  // 注意! 右侧的数值大小不能超过左侧的类型范围
		byte num5 = 50;
		// byte + byte --> int + int --> int
		int result1 = num4 + num5;  
		System.out.println(result1); // 90
		
		byte num6 = 60;
		// byte + short --> int + int -int
		// int强制转换为short：注意要保证右侧的没有超过short的范围，否则会发生数据溢出
		short result2 = (short) (num4 + num6);
		System.out.println(result2);  // 100
	}
}