/* 
	����byte/short/char����������˵������Ҳำֵ����ֵû�г�����෶Χ��
	��ôjavac�����������Զ�������Ϊ���ǲ���һ��(byte)(short)(char)
	
	1. ����Ҳ�û�г������ķ�Χ���������Ჹ��ǿת
	2. ����Ҳ೬�������ķ�Χ����ôֱ�ӱ���������
 */

public class Demo12Notice {
	public static void main(String[] args) {
		// �Ҳ�ȷʵ��һ��int���֣���û�г������ķ�Χ��������ȷ��
		// int --> byte, �����Զ�����ת��
		byte num1 = /*(byte)*/ 30; // �Ҳ�û�г������ķ�Χ
		System.out.println(num1); // 30
		
		// byte num2 = 128;  // �Ҳ����ֳ��������ķ�Χ
		
		// int --> char , û�г�����෶Χ
		// ���������Զ�����һ��������(char)
		char zifu = /*(char)*/ 65;
		System.out.println(zifu); // A
	}
}