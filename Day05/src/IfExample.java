//���ǹ� IF
public class IfExample {

	public static void main(String[] args) {
		
		
		// 1. if ���� ������
		// if (���Ǻ񱳹�) { ���϶� ���� }
		// if (���Ǻ񱳹�) { ���϶� ���� } else { �����϶� ���� }
		// if (���Ǻ񱳹�) { ���� } else if (���Ǻ񱳹�) { �� } else { ���� }
		// if ( ) { } else if ( ) { }
		
		int a = 10, b = 15;
		if (a != 10 || b > 15) {
			System.out.println("���Դϴ�");
		}
		else {
			System.out.println("�����Դϴ�");
		}
		
//		if(false) {
//			System.out.println("���Դϴ�");
//		}
//		else {
//			System.out.println("�����Դϴ�");
//		}
		
//		int c = 11;
//		if (c % 2 == 0) {
//			
//			System.out.println("c�� 2�� �������� ��");
//		}
//		else if (c % 3 == 0) {
//			System.out.println("c�� 3�� �������� ��");
//		}
//		else if (c % 4 == 0) {
//			
//			System.out.println("c�� 4�� �������� ��");
//		}
//		else if (c % 1 == 0) {
//			
//			System.out.println("c�� 1�� �������� ��");
//		}
//		else {
//			System.out.println("c�� �������� ���� ����");
//			
//		}
		
//		int c = 11;
//		int d = 0;
//		if (c % 2 == 0) {
//			d ++;
//			System.out.println("c�� 2�� �������� ��");
//		}
//		else if (c % 3 == 0) {
//			d ++;
//			System.out.println("c�� 3�� �������� ��");
//		}
//		else if (c % 4 == 0) {
//			d ++;
//			System.out.println("c�� 4�� �������� ��");
//		}
//		else if (c % 1 == 0) {
//			d 100;
//			System.out.println("c�� 1�� �������� ��");
//		}
//		else {
//			d ++;
//			System.out.println("c�� �������� ���� ����");
//			
//		}
//		System.out.println(d);
		
		int c = 11;
		int d = 0;
				if (c % 2 == 0 || d++ > 0) {
					System.out.println("c�� 2�� �������� ��");
				}
				else if (c % 3 == 0 || d++ > 0) {
					System.out.println("c�� 3�� �������� ��");
				}
				else if (c % 4 == 0 || d++ > 0) {
					System.out.println("c�� 4�� �������� ��");
				}
				else if (c % 1 == 0 || d++ > 0) {
					System.out.println("c�� 1�� �������� ��");
				}
				else {
					System.out.println("c�� �������� ���� ����");
					
				}
			System.out.println(d);
	}
	
	
}
