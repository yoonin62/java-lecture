import java.util.*;

public class SampleProject {
	
	public static void main(String[] args) {
		
		Scanner sc;
		String input;
		
		while(true) {
			System.out.print("문자열을 입력해주세요>>");
			sc = new Scanner(System.in);
			input = sc.nextLine();
			
			
			System.out.println("입력값은 '" + input + "' 입니다.");
			
			if(input.equals("quit")) {
				sc.close();
				System.out.println("프로그램 종료");
				
			}
		}
	}

}
