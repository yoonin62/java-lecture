
//�ݺ����� ��ǻ�Ͱ� ���α׷��� �д� ��Ŀ���
//���� (���� �ٽ� ���ư��� �а��ϴ�) �ϴ� ������ �����̴�.
public class LoopExample {

	public static void main(String[] args) {

		// for - ���� ���� ���
		//while
		// do while
		
		// 1. for ( �Ҵ�� or �ʱ�ȭ(��������-������ ����) ; ���Ǻ񱳽� ; ��������(�������� - print���� ����) ){
		// -- ���Ⱑ �ݺ�����
		//}
		
		int i;
		for (i = 2 ; i < 10 ; i ++) {
			System.out.println(i);
		}
		
		System.out.println("���� i����" + i + "�Դϴ�.");
		
		// 2. while
		// while (���ǽ� {
		// ���̸� ����
		// }
		
		int x = 10;
		while (++x < 20) {
			System.out.println(x);
			if(x++ > 20) break;
		}
		
		// 3. do while
		// do {
		//
		// } while (���ǽ�) ;
		
		x = 10;
		System.out.println("do~while");
		do {
			System.out.println(x);
		} while (++x < 20);
		
	}
}
