/* 
	���������Ͳ�һ��ʱ���ͻᷢ����������ת��
	
	�Զ�����ת������ʽ��
		1. �ص㣺���벻��Ҫ�������⴦���Զ����
		2. �������ݷ�Χ��С�������ֽ�����һ����ȫ���
	
	ǿ������ת������ʽ��
 */

public class Demo01DataType {
	public static void main(String[] args) {
		System.out.println(1024);	// ����һ��������Ĭ����int����
		System.out.println(3.14);	// ����һ����������Ĭ����double����
		
		// �����long���ͣ��ұ���Ĭ�ϵ�int���ͣ����Ҳ�һ����
		// int --> long ���������ݷ�Χ��С�����Ҫ��
		// ��һ�д��뷢�����Զ�����ת��
		long num1 = 100;
		System.out.println(num1);	// 100
		
		// float --> double
		double num2 = 2.5F;
		System.out.println(num2); // 2.5
		
		// long --> float ,��Χ�������float���������ݷ�Χ��С����Ĺ���
		float num3 = 30L; 
		System.out.println(num3);  // 30.0
	}
}