import java.io.*;


public class SampleInputStream {

	public static void main(String[] args) throws Exception{
		
		System.out.print("문자를 입력해주세요.>>");
		InputStream in = System.in;
//		int input = in.read();
		byte[] b = new byte[5];
		int input = in.read(b);
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("ASCII Code : "+input + " CharValue : "+(char)b[i]);
		}
		
//		System.out.println("ASCII Code : "+input + " CharValue : "+(char)input);
//		System.out.println("입력값 : "+input);
		
	}
}
