//Switch Case
public class SwitchExample {

	public static void main(String[] args) {
		
		
		//switch(����)
		//{
		// case �񱳰� : 
		// break;
		// case �񱳰� :
		// break;
		// default :
		//
		//}
		
		int month =12;
		String month_name = "";
		switch(month) {
		case 10 : 
			month_name = "Oct";
			break;
		case 11 :
			month_name = "Nov";
			break;
		case 12 :
			month_name = "Dec";
			break;
		default :
			month_name = "����";
			break;
		}
		System.out.println(month + "���� ����� " + month_name + "�Դϴ�.");
		
		
	}
	
	
	
	
	
}
