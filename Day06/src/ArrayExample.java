
public class ArrayExample {
	
	public static void main(String[] args) {
		// �迭
		// ���� ����
		// ���������
		// ������Ÿ�� ������ [����] or ������Ÿ�� [���� ] ������
		// int x[10];
		
		int[] a  = new int[10];
//		a[0] =1;
//		a[1] =2;
//		a[2] =3;
//		a[3] =4;
//		a[4] =5;
		
		for(int i = 0; i <5;i++) {
			a[i] = i;
		}
		//a[5] = 10; // Array out of bound exception
		
		
		int[] b = {97,98,99,100};
		
		for(int i=0; i < b.length; i++) {
//			System.out.println((char)i+1);
			char result = (char)b[i];
			System.out.println(result);
		}
		
		// �迭 ����
		// 1. �迭�� ���� ������Ÿ���� ������ �������� ��
		// int[5] -> 4*5 = 20 bytes
		
		// �迭 �����
		// char [] ������;
		
		// �迭 ����� ���ÿ� �� �����
		// char[] ������ = new char[5];
		// ���ʱ� a[0] = 97; a[1] = 98;...
		
		char[] alpha = new char[24];
		char alpha_start = 'A';//97;
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = alpha_start ++;
		}
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i]);
		}
		
		
		// �迭 ����� ���ÿ� �� �����ֱ�
		// ������Ÿ�� �迭������ = {��};
		char arrCh = {97, 98, 99};
	}

}
