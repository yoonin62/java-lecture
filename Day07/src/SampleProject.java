import java.util.*;

public class SampleProject {
	
	public static void main(String[] args) {
		
		Scanner sc;
		String input;
		
		while(true) {
			System.out.print("���ڿ��� �Է����ּ���>>");
			sc = new Scanner(System.in);
			input = sc.nextLine();
			
			
			System.out.println("�Է°��� '" + input + "' �Դϴ�.");
			
			if(input.equals("quit")) {
				sc.close();
				System.out.println("���α׷� ����");
				
			}
		}
	}

}
