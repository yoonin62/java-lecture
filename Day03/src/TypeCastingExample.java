
public class TypeCastingExample {

	public static void main(String[] args) {
		
		//������ ������ Ÿ�� 
		//����� ����ȯ
		int a = 10; // 4bytes
		short b = (short)a; // 2bytes
		
		//������ ����ȯ
		short c = 100; // 2bytes
		int d = c; // 4bytes
		
		//byte x = 128; //1bytest -128 ~ 127 �����̹Ƿ� ������ ���
		
		
		//Example
		int a1 = 128;
		byte x1 = (byte)a1;
		System.out.println(x1);//�����Ⱚ�� ��(-128) error
		
		//�����, �ݿø� �ƴϰ� �ڸ�
		double xa = 3.641562;
		int xb = (int)xa;
		System.out.println(xb);
		
		
		//������
		int ya = 10;
		double yb = ya;
		System.out.println(yb);
	}
	
}
