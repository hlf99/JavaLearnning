/* 
	whileѭ����һ����׼��ʽ������һ����չ��ʽ
	
	��׼��ʽ��
	while (�����ж�) {
		ѭ����
	}
	
	��չ��ʽ��
	
	��ʼ�����;
	while (�����ж�) {
		ѭ����;
		�������;
	}
 */

public class Demo10While {
	public static void main(String[] args) {
		int i = 0;	// ��ʼ�����
		while (i < 10) {	// �����ж�
			System.out.println("�Ҵ�����ԭ���Ұɣ�" + i);
			i++;  // �������
		}
	}
}