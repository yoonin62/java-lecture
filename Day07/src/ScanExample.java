import java.util.Scanner;

public class ScanExample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요.>>");
		String input = sc.nextLine();
		
		System.out.println("입력문자열 : " + input);
	}

}
