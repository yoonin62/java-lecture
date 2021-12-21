
public class ScopeExample {

	String name ="오잉 바보";
	
	//Scope
	public static void main(String[] args) {
		
		
		
		String name ="오잉";

		
		{
			String g_name = "고구마";
			System.out.println(g_name);
		}
		
		//g_name = "감자";// Scope가 달라서 에러
		System.out.println(name);
		
	}
	
}
