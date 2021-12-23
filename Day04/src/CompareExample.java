//비교연산
public class CompareExample {

	public static void main(String[] args) {
	// 참/거짓을 밝히는 연산
	// >, < , >=, <=
	// ==같다 ( = 할당 )
	// != 같지 않다
	// 결과 값은 boolean
	
	int a = 10, b = 20, c=10;
	
	System.out.println("a > b : " + (a>b));
	System.out.println("a < b : "+ (a<b));
	System.out.println("a >= b : " + (a>=b));
	
	boolean result = (a>=b);
	System.out.println("a >= b : "  +result);
	
	System.out.println("!(a > b) : " + !(a>b));
	//!는 not을 의미한다. !false == true / !true == false
	
	System.out.println("a == b : " +(a==b));
	
	System.out.println("a != b : "+(a!=b));
	}
	
}
