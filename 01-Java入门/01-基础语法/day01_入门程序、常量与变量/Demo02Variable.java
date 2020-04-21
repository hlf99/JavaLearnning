/* 
	变量：程序运行期间，内容可以改变的量。
	
	创建一个变量并且使用的格式：
	数据类型 变量名;  // 创建了一个变量
	变量名称 = 数据值;  // 给变量赋值
	
	一步到位的格式：
	数据类型 变量名 = 数据值;  // 在创建变量的同时立即赋值
	
 */
 public class Demo02Variable {
	 public static void main(String[] args) {
		int num1 = 25;
		System.out.println("int：" + num1);
		
		byte num2 = 30;
		System.out.println("byte：" + num2);
		
		// byte num3 = 200;	//变量值超出了byte的数据范围，错误
		// System.out.println(num3);
		
		short num4 = 40;
		System.out.println("short：" + num4);
		
		long num5 = 50000000000L;
		System.out.println("long：" + num5);
		
		float num6 = 2.5F;
		System.out.println("float：" + num6);
		
		double num7 = 3.14;
		System.out.println("double：" + num7);
		
		char char1 = 'A';
		System.out.println("char：" + char1);
		
		char char2 = '中';
		System.out.println("char：" + char2);
		
		boolean bool1 = true;
		System.out.println("bool：" + bool1);
		
		boolean bool2 = false;
		System.out.println("bool：" + bool2);
	 }
 }