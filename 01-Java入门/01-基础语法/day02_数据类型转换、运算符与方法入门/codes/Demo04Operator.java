/* 
	������������ض������ķ��š����磺+��-��*��/
	���ʽ�������������������ʽ�ӽ������ʽ�����磺20 + 6 �� a + c
	
	�������㣺
		�ӣ�+
		����-
		�ˣ�*
		����/
	ȡģ��ȡ��������%
	
	������ʽ�� ������ / ���� = �� ... ����
	
	����ֻ�������ı��ʽ��˵�������õ������������������������������������ֻ���̣�����������
	ֻ�ж��������ĳ�����˵��ȡģ������������������塣
	
	ע�����
		1 һ���������в�ͬ���͵����ݣ���ô��������ͽ��������ݷ�Χ�������
 */

public class Demo04Operator {
	public static void main(String[] args) {
		// ��������֮����Խ�����ѧ����
		System.out.println(20 + 30); // 50
		
		// ��������֮��Ҳ���Խ�����ѧ����
		int a = 10;
		int b = 30;
		System.out.println(a - b);	// -20
		
		// �����ͳ���֮����Ի��ʹ��
		System.out.println(a * 6); // 60
		
		int x = 10;
		int y = 3;
		
		int result1 = x / y;
		System.out.println(result1); // 3
		
		int result2 = x % y;
		System.out.println(result2); // 1
		
		// int + double -> double + double --> double
		double result3 = x + 2.5;
		System.out.println(result3); // 12.5
	}
}