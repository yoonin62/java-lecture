
public class TypeCastingExample {

	public static void main(String[] args) {
		
		//정수형 데이터 타입 
		//명시적 형변환
		int a = 10; // 4bytes
		short b = (short)a; // 2bytes
		
		//묵시적 형변환
		short c = 100; // 2bytes
		int d = c; // 4bytes
		
		//byte x = 128; //1bytest -128 ~ 127 범위이므로 범위를 벗어남
		
		
		//Example
		int a1 = 128;
		byte x1 = (byte)a1;
		System.out.println(x1);//쓰레기값이 들어감(-128) error
		
		//명시적, 반올림 아니고 자름
		double xa = 3.641562;
		int xb = (int)xa;
		System.out.println(xb);
		
		
		//묵시적
		int ya = 10;
		double yb = ya;
		System.out.println(yb);
	}
	
}
