public class Demo17LoopHourAndMinute {
	public static void main(String[] args) {
		for (int hour = 0; hour < 24; hour++) {  // ��һ��ѭ������Сʱ 
			for (int minute = 0; minute < 60; minute++) { // �ڶ���ѭ�����Ʒ���
				for (int second = 0; second < 60; second++) { // ������ѭ��������
					System.out.println(hour + "��" + minute + "��" + second + "��");
				}
			}
		}
	}
}