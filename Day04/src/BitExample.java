
public class BitExample {

	public static void main(String[] args) {
		
		
		int a = 10, b = 11;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println("a | b : " + (a|b));
		System.out.println("a & b : " + (a&b));
		System.out.println("a ^ b : " + (a ^b));
		
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.toBinaryString(-2));
		
		//shift ����
		//>>, <<, >>>
		byte x = 10;
		System.out.println("x >> 2 : " + (x >>2));
		
		
		//���� shift
		x = -10;
		System.out.println("-10 :"+Integer.toBinaryString(x));
		System.out.println("-10 >> 5 :" + Integer.toBinaryString(x >> 5));
		
		
		//���� shift
		System.out.println("-10 << 5 :" + Integer.toBinaryString(x << 5));
		
		byte z = 1;
		System.out.println("1 << 7 : " + (byte)(z << 7));
	
//		System.out.println("1 << 8 : " + (z << 8));
		
	}
	
}
