/* 
	��Ŀ�����1-100֮���ż����
	
 */

public class Demo12HundreSum {
	public static void main(String[] args) {
		// forѭ����
		// int sumEven = 0;	// ż����
		// int sumOdd = 0;  // ������
		
		// for (int i = 1; i <= 100; i++) {
			// if (i % 2 == 0) {  // �����ż��
				// sumEven += i;
			// } else {
				// sumOdd += i;
			// }
		// }n
		
		// System.out.println("1~100֮���ż����Ϊ��" + sumEven);
		// System.out.println("1~100֮���������Ϊ��" + sumOdd);
		
		// whileѭ����
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
		// System.out.println("1~100֮���ż����Ϊ��" + sumEven);
		// System.out.println("1~100֮���������Ϊ��" + sumOdd);
		
		// do-whileѭ����
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
		System.out.println("1~100֮���ż����Ϊ��" + sumEven);
		System.out.println("1~100֮���������Ϊ��" + sumOdd);
	}
}