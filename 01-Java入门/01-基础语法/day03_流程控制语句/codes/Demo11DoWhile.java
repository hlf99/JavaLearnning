/* 
	do-whileѭ���ı�׼��ʽ��
	
	do {
		ѭ����
	} while (�����ж�)
		
	��չ��ʽ��
	
	��ʼ�����;
	do {
		ѭ����;
		�������;
	} while (�����ж�)
 */

public class Demo11DoWhile {
	public static void main(String[] args) {
		int i = 0;  // 1. ��ʼ�����
		
		do {
			System.out.println("ԭ�������������ɣ����Ϲ����ģ�" + i); // 3. ѭ����
			i++;  // 4. �������
		} while (i < 10);  //2. �����жϣ����ź�ķֺŲ�����
	}
}