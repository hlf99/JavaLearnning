/* 
	����һ�������ĸ�ʽ��
	public static void ��������() {
		������
	}
	
	�������Ƶ���������ͱ���һ����ʹ��С�շ塣
	�����壺Ҳ���Ǵ������п��԰�����������䡣
	
	ע�����
		1. ����������Ⱥ�˳������ν��
		2. �����Ķ��岻�ܲ���Ƕ�װ�����ϵ��
		3. ��������ú󣬲���ִ�С����Ҫִ�У�һ��Ҫ���з����ġ����á�
		
	��ε��÷�������ʽ��
		��������();
 */

public class Demo11Method {
	public static void main(String[] args) {
		farmer(); // ����ũ��ķ���
		seller(); // �����̷��ķ���
		cook();	// ���ó��ӵķ���
		me(); // �������Լ��ķ���
	}
	
	// ũ�񲮲�
	public static void farmer() {
		System.out.println("����");
		System.out.println("��ˮ");
		System.out.println("ʩ��");
		System.out.println("����");
		System.out.println("�ո�");
		System.out.println("����С�̷�");
	}
	
	// �̷�
	public static void seller() {
		System.out.println("���䵽ũó�г�");
		System.out.println("̧�߼۸�");
		System.out.println("ߺ��");
		System.out.println("��������");
	}
	
	// ����
	public static void cook() {
		System.out.println("ϴ��");
		System.out.println("�в�");
		System.out.println("����");
		System.out.println("װ��");
	}
	// ��
	public static void me() {
		System.out.println("��");
	}
}