/* 
	题目：求出1-100之间的偶数和
	
 */

public class Demo12HundreSum {
	public static void main(String[] args) {
		// for循环：
		// int sumEven = 0;	// 偶数和
		// int sumOdd = 0;  // 奇数和
		
		// for (int i = 1; i <= 100; i++) {
			// if (i % 2 == 0) {  // 如果是偶数
				// sumEven += i;
			// } else {
				// sumOdd += i;
			// }
		// }n
		
		// System.out.println("1~100之间的偶数和为：" + sumEven);
		// System.out.println("1~100之间的奇数和为：" + sumOdd);
		
		// while循环：
		// int sumEven = 0;
		// int sumOdd = 0;
		// int i = 1;
		// while (i <= 100) {
			// if (i % 2 == 0) {
				// sumEven += i;
			// } else {
				// sumOdd += i;
			// }
			// i++;
		// }
		// System.out.println("1~100之间的偶数和为：" + sumEven);
		// System.out.println("1~100之间的奇数和为：" + sumOdd);
		
		// do-while循环：
		int sumEven = 0;
		int sumOdd = 0;
		int i = 1;
		do {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
			i++;
		} while (i <= 100);
		System.out.println("1~100之间的偶数和为：" + sumEven);
		System.out.println("1~100之间的奇数和为：" + sumOdd);
	}
}