// 변수
// 변수 명명규칙은 단봉낙타

public class Variable {
	public static void main(String[] args) {
		//자료형 변수명 = 데이터
		
		int a =10;
		int x;
		int myAge = 19;
		
		System.out.println(a);
		System.out.println(a+a);
		System.out.println(a*a);
		
		x = 9;
		x = a - x;
		
		//변수의 문법적 특징
		//1. 변수의 시작은 숫자일 수 없다.
		//2. 변수의 이름은 예약어일 수 없다.
		//3. 공백 사용불가
		//4. 같은 Scope { --- }에 같은 이름의 변수는 사용불가
		//5. 대소문자는 구분한다.
	}
}
