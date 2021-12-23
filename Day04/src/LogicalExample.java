//논리연산
public class LogicalExample {

	
	public static void main(String[] args) {
		
		// AND, OR, XOR, NOT
		// 1. AND 연산
		// &, && - true & true, true && true
		// 양쪽 모두 참이어야 결과값이 참이다.
		
		int a = 10, b = 15;
		boolean result = (a != b) && ( a < b);
		System.out.println(result && false);
		
		
	}
	
}
