
public class MathExample {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		
		//변수사용 시 a(4bytes) + b(4bytes) = 8bytes
		System.out.println(a + b);//덧셈
		// 토탈 사용 바이트는 4 *5 = 20바이트
		System.out.println(10 + 20+ 10 + 20 );
		
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println("a / b = " + (a / b));
		//나눗셈 0.5 이지만 기본정수형은 int 이기 때문에 0을 출력한다.
		
		int c = 15;
		
		System.out.println("c % a =" + c % a);
		
		
	}
	
}
