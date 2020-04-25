public class Demo03IfElse {
	public static void main(String[] args) {
		int num = 13;
		
		if (num % 2 == 0) { // 如果num取余为0，则为偶数，否则为奇数
			System.out.println(num + "为偶数");
		} else {
			System.out.println(num + "为奇数");
		}
	}
}