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
		
		int c = 10, d = 10;
		System.out.println((c++ == d++) && (c > d));
		
		//&& 은 false && true 의 수식이 있을 때, false를 먼저 만남
		//뒤의 수식은 볼 필요없으므로 바로 패스
		// &는 다 본다.
		
		System.out.println((c>d) && (c++ == ++d));
		System.out.println("c = " + c + "," + "d = " + d);
		
		
		// 2. OR 연산
		// |, ||
		// 둘 중 하나가 true면 무조건 true
		
		int x = 100, y = 200;
		System.out.println(x != y || (x++ == y++));
		System.out.println("x = " + x + "," + "y = " + y);
		
		// 3. XOR 연산
		// ^
		// 양쪽이 달라야 true, 양쪽이 같으면 false
		// true ^ true = ? (false)
		// true ^ false = ? (true)
		// false ^ false =? (false)
		
		
		// 4. NOT
		// !true == false
		// !false == true
		// a != b
		
	}
	
}
