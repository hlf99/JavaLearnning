public class Demo05IfElsePractice {
	public static void main(String[] args) {
		int score = 101;
		if (score < 0 || score > 100) {
			System.out.println("��ĳɼ��Ǵ���ģ�");
		} else if (score >= 90) {
			System.out.println("��ĳɼ���������");
		} else if (score >= 80) {
			System.out.println("��ĳɼ����ں�");
		} else if (score >= 70) {
			System.out.println("��ĳɼ�������");
		} else if (score >= 60 ) {
			System.out.println("��ĳɼ����ڼ���");
		} else {
			System.out.println("��ĳɼ����ڲ�����");
		}
	}
}