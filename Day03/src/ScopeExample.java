
public class ScopeExample {

	String name ="���� �ٺ�";
	
	//Scope
	public static void main(String[] args) {
		
		
		
		String name ="����";

		
		{
			String g_name = "����";
			System.out.println(g_name);
		}
		
		//g_name = "����";// Scope�� �޶� ����
		System.out.println(name);
		
	}
	
}
