/* 
	����ѭ��������
	
	1. ��������жϴ���û�����������ôfor��whileѭ������ִ��0�Σ���do-whileѭ��ִ������һ��
	2. forѭ���ı�����С�����ж��壬ֻ��ѭ���ڲ��ſ���ʹ�á�whileѭ����do-whileѭ����ʼ����䱾���������棬����ѭ��֮�󻹿��Լ���ʹ��
 */

public class Demo13LoopDifference {
	public static void main(String[] args) {
		for (int i = 1; i < 0; i++) {
			System.out.println("Hello");
		}
		// System.out.println(i);  // ��һ���Ǵ����д������Ϊ����i������forѭ��С�����ڣ�ֻ��forѭ���Լ�������
		System.out.println("==========");
		
		int i = 1;
		do {
			System.out.println("World");
			i++;
		} while (i < 0);
		// �����Ѿ�������do-whileѭ���ķ�Χ��������Ȼ����ʹ�ñ���i
		System.out.println(i);  // 2
	} 
}