/* 
��һ��ѭ�����������continue�ؼ��֡�
һ��ִ�У�������������ǰ��ѭ����ִ����һ��ѭ����
 */

public class Demo15Continue {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {  // �����ǰ�ǵ���¥
				continue; // ��ô������ǰ��ѭ�������Ͽ�ʼ��һ��ѭ��������¥��
			}
			System.out.println(i + "¥����");
		}
	}
}