/* 
	���ֺ��ַ��Ķ��չ�ϵ���������
	
	ASCII���American Standard Code Information Interchange,������Ϣ������׼����
	Unicode�������롣Ҳ�����ֺͷ��ŵĶ��չ�ϵ����ͷ0~127���ֺ�ASCII��ȫһ��������128��ʼ���������ַ�
 */

public class Demo03DataTypeChar {
	public static void main(String[] args) {
		char zifu1 = '1';
		System.out.println(zifu1 + 0); 	// 49
		
		char zifu2 = 'A';	// ��ʵ�ײ㱣���������65
		
		char  zifu3 = 'c';
		// �����int���ͣ��Ҳ���char����
		// char --> int 
		// �������Զ�����ת��
		int num = zifu3;
		System.out.println(num); // 99
		
		char zifu4 = '��';   // ��ȷд��
		System.out.println(zifu4 + 0);  // 20013
	}
}