/* 
	ǿ������ת����
		1 �ص㣺������Ҫ����ĸ�ʽ���������Զ���ɡ�
		2 ��ʽ����ΧС������ ��ΧС�ı����� = (��ΧС������) ԭ����Χ�������
		
	ע�����
		1 ǿ������ת��һ�㲻�Ƽ�ʹ�ã���Ϊ�п��ܷ���������ʧ������С�������������������������
		2 byte/short/char���������Ϳ��Է�����ѧ���㣬����ӷ���+��
		3 byte/short/char����������������ʱ�����ᱻ����������Ϊint���ͣ�Ȼ��������
		4 boolean���Ͳ��ܷ�����������ת��
 */

public class Demo02DataType {
	public static void main(String[] args) {
		// �����int���ͣ��ұ���long���ͣ���һ��
		// long --> int �����Ƿ�Χ��С���󣬲����Զ����ת��
		// ��ʽ����ΧС������ ��ΧС�ı����� = (��ΧС������) ԭ����Χ�������
		int num = (int) 100L;
		System.out.println(num);  // 100
		
		// long����ǿ��ת����int����
		int num2 = (int) 6000000000L;
		System.out.println(num2);  // 1705032704
		
		// double --> int ��ǿ������ת��
		int num3 = (int) 3.99;
		System.out.println(num3); // 3���Ⲣ�����������룬���е�С��λ���ᱻ������
		
		char zifu1 = 'A'; // ����һ���ַ��ͱ����������Ǵ�д��ĸA
		System.out.println(zifu1 + 1);  // 66��Ҳ����A��������65���м���
		// ������ĵײ����һ�����֣������ƣ��������ַ�A��Ҳ����65
		// һ��char���ͽ�������ѧ���㣬��ô�ַ��ͻᰴ��һ���Ĺ������һ������
		
		byte num4 = 40;  // ע��! �Ҳ����ֵ��С���ܳ����������ͷ�Χ
		byte num5 = 50;
		// byte + byte --> int + int --> int
		int result1 = num4 + num5;  
		System.out.println(result1); // 90
		
		byte num6 = 60;
		// byte + short --> int + int -int
		// intǿ��ת��Ϊshort��ע��Ҫ��֤�Ҳ��û�г���short�ķ�Χ������ᷢ���������
		short result2 = (short) (num4 + num6);
		System.out.println(result2);  // 100
	}
}