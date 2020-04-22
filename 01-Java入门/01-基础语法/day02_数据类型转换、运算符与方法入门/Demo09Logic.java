/* 
	�루���ң� &&  ֻҪ��һ��Ϊfalse����Ϊfalse��ȫ������true������true
	�򣨻��ߣ� ||  ֻҪ��һ��Ϊtrue,��Ϊtrue��ȫ����false,����false	
	�ǣ�ȡ����	!   ������true����Ϊfalse��������false����Ϊtrue
	
	�롰&&���� ��||�������ж�·Ч���� �����������Ѿ������жϵõ����յĽ������ô�ұߵĴ��뽫����ִ�У��Ӷ���ʡһ��������
	
	ע�����
		1. �߼������ֻ������booleanֵ
		2. �롢����Ҫ���Ҹ���һ��booleanֵ������ȡ��ֻҪһ��booleanֵ����
		3. �롢�����������������ж����������������д��
		��������������A && ����B
		�������������A && ����B && ����C
		
	TIPS:
	����1 < x < 3�������Ӧ�ò��Ϊ�������֣�Ȼ��ʹ�����������������
	int x = 2;
	1 < x && x < 3
 */

public class Demo09Logic {
	public static void main(String[] args) {
		System.out.println(true && false); // false
		// true && true => true
		System.out.println(3 < 4 && 10 > 5); // true
		System.out.println("==========");
		
		System.out.println(true || false); // true
		System.out.println(true || true); // true
		System.out.println(false && false); // false
		System.out.println("==========");
		
		System.out.println(!false); // true
		System.out.println(!true); // false
		System.out.println("==========");
		
		int a = 10;
		// false && ....
		System.out.println(3 > 4 && ++a < 100);  // false����Ϊ����ж�Ϊfalse�������Ҳ಻ִ��
		System.out.println(a); // 10
		System.out.println("==========");
		
		int b = 20;
		// true || ...
		System.out.println(3 < 4 || ++b < 100); // true����Ϊ����ж�Ϊtrue�������Ҳ಻ִ��
		System.out.println(b); // 20
	}
}