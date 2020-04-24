public class Demo06Max {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// 首先使用三元运算符
		// int max = a > b ? a : b;
		
		// 使用if语句
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("最大值：" + max);
	}
}