/* 
	�����������++
	�Լ��������--
	
	�������壺��һ��������һ������1������һ��������һ������1
	ʹ�ø�ʽ��д�ڱ���֮ǰ��֮�����磺++num�� num++
	ʹ�÷�ʽ��
		1.����ʹ�ã���������������ϣ��Լ�����һ����䡣
		2.���ʹ�ã�������������ϣ�Ҳ����һ������л������������
	ʹ������
		1.�ڵ���ʹ�õ�ʱ��ǰ++�ͺ�++û������Ҳ���ǣ�++num;��num++;����ȫһ����
		2.�ڻ��ʹ��ʱ���С��ش�����
			A. ����ǡ�ǰ++������ô�������������ϼ�1����Ȼ�����Ž������ʹ�á� ���ȼӺ��á�
			B. ����ǡ���++������ô����ʹ�ñ�����������ֵ����Ȼ�����ñ�����1���� �����ú�ӡ�
	ע�����ֻ�б�������ʹ���������Լ���������������ɷ����ı䣬���Բ����á�
 */

public class Demo06Operator {
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1); // 10
		++num1; // ����ʹ�ã�ǰ++
		System.out.println(num1);  // 11
		num1++;  // ����ʹ�ã���++
		System.out.println(num1); // 12
		System.out.println("===============");
		
		// ���ӡ�������ʹ��
		int num2 = 20;
		// ���ʹ�ã���++���������̱�Ϊ21��Ȼ���ӡ���21
		System.out.println(++num2); // 21
		System.out.println(num2); // 21
		System.out.println("===============");
		
		int num3 = 30;
		// ���ʹ�ã���++������ʹ�ñ���������30��Ȼ�����ñ�����1��Ϊ31
		System.out.println(num3++); // 30
		System.out.println(num3);	// 31
		System.out.println("===============");
		
		int num4 = 40;
		// �͸�ֵ�������
		int result1 = --num4;	// ���ʹ�ã�ǰ--����������-1��Ϊ39��Ȼ�󽫽��39����result1����
		System.out.println(result1); // 39
		System.out.println(num4); // 39  
		System.out.println("===============");	

		int num5 = 50;
		int result2 = num5--; // ���ʹ�ã���--���Ƚ�num5������ֵ50����result2��Ȼ����-1��Ϊ49
		System.out.println(result2); // 50
		System.out.println(num5); // 49
		System.out.println("===============");
		
		int x = 10;
		int y = 20;
		int result3 = ++x + y--;
		System.out.println(result3); // 31
		System.out.println(x); // 11
		System.out.println(y);  // 19
	}
}