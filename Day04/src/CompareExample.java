//�񱳿���
public class CompareExample {

	public static void main(String[] args) {
	// ��/������ ������ ����
	// >, < , >=, <=
	// ==���� ( = �Ҵ� )
	// != ���� �ʴ�
	// ��� ���� boolean
	
	int a = 10, b = 20, c=10;
	
	System.out.println("a > b : " + (a>b));
	System.out.println("a < b : "+ (a<b));
	System.out.println("a >= b : " + (a>=b));
	
	boolean result = (a>=b);
	System.out.println("a >= b : "  +result);
	
	System.out.println("!(a > b) : " + !(a>b));
	//!�� not�� �ǹ��Ѵ�. !false == true / !true == false
	
	System.out.println("a == b : " +(a==b));
	
	System.out.println("a != b : "+(a!=b));
	}
	
}
