/* 
	��ֵ�������Ϊ��
	
	������ֵ�����������һ���Ⱥš�=���������Ҳ�����ݽ������ı�����
		int a = 30;
	
	���ϸ�ֵ�������
		+=		a += 3  => a = a + 3 
		-=		b -= 4 	=> b = b - 4
		*=		c *= 5  => c = c * 5
		/=		d /= 6  => d = d / 6
		%=		e %= 7  => e = e % 7 
		
	ע�����
		1. ֻ�б�������ʹ�ø�ֵ��������������ܽ��и�ֵ��
		2. ���ϸ�ֵ���������������һ��ǿ������ת��
 */

public class Demo07Operator {
	public static void main(String[] args) {
		int a = 10;
		a += 5;
		System.out.println(a);  // 15
		
		int x = 10;
		x %= 3;
		System.out.println(x); // 1
		
		byte num = 30;
		// num = num + 5;
		// num = byte + int
		// num = int + int 
		// num = int
		// num = (byte) int  ������ǿ������ת��
		num += 5;
		System.out.println(num);  // 35
	}
}