/* 
	常量：在程序运行期间，固定不变的量
	
	常亮的分类：
	1、字符串常量：凡是用双引号引起来的部分，叫做字符串常量。如："123"、"asd446"、"小明"
	2、整数常量：直接写上的数字，没有小数点。如：100、200、0、-230
	3、浮点数常量：直接写上的数字，有小数点。如：1.5、-3.9、425.55
	4、字符常量：凡是用单引号引起来的单个字符，叫做字符常量。如：'a'、'90'、'过'
	5、布尔常量：只有两种取值，true和false
	6、空常量：null，表示没有任何数据。
 */
 public class Demo01Const {
	 public static void main(String[] args) {
		 // 输出字符串常量
		 System.out.println("我爱中国");
		 System.out.println(""); // 字符串中间为空也是可行的
		 
		 // 输出整数常量
		 System.out.println(200);
		 
		 // 输出浮点数常量（小数）
		 System.out.println(3.14);
		 
		 // 输出字符常量
		 System.out.println('A');
		 // System.out.println('');	// 两个单引号中间必须有且仅有一个字符，没有就会报错
		 // System.out.println('ab');	// 两个单引号中间必须有且仅有一个字符，有两个不行
		 
		 // 输出布尔常量
		 System.out.println(true);
		 System.out.println(false);
		 
		 // 空常量 不能直接用来打印输出
		 // System.out.println(null);
		 
	 }
 }