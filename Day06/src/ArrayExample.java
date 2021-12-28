
public class ArrayExample {
	
	public static void main(String[] args) {
		// 배열
		// 값의 집합
		// 변수선언법
		// 데이터타입 변수명 [갯수] or 데이터타입 [갯수 ] 변수명
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
		
		// 배열 정리
		// 1. 배열은 같은 데이터타입을 가지는 연속적인 방
		// int[5] -> 4*5 = 20 bytes
		
		// 배열 선언법
		// char [] 변수명;
		
		// 배열 선언과 동시에 방 만들기
		// char[] 변수명 = new char[5];
		// 값너기 a[0] = 97; a[1] = 98;...
		
		char[] alpha = new char[24];
		char alpha_start = 'A';//97;
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = alpha_start ++;
		}
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i]);
		}
		
		
		// 배열 선언과 동시에 값 때려넣기
		// 데이터타입 배열변수명 = {값};
		char arrCh = {97, 98, 99};
	}

}
