/* 
	数字和字符的对照关系表（编码表）：
	
	ASCII码表：American Standard Code Information Interchange,美国信息交换标准代码
	Unicode码表：万国码。也是数字和符号的对照关系，开头0~127部分和ASCII完全一样，但从128开始包含更多字符
 */

public class Demo03DataTypeChar {
	public static void main(String[] args) {
		char zifu1 = '1';
		System.out.println(zifu1 + 0); 	// 49
		
		char zifu2 = 'A';	// 其实底层保存的是数字65
		
		char  zifu3 = 'c';
		// 左侧是int类型，右侧是char类型
		// char --> int 
		// 发生了自动类型转换
		int num = zifu3;
		System.out.println(num); // 99
		
		char zifu4 = '中';   // 正确写法
		System.out.println(zifu4 + 0);  // 20013
	}
}