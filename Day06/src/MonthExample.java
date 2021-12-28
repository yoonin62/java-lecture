
public class MonthExample {
	
	public static void main(String args[]) {
		
		if(args.length == 0) {
			System.out.println("usaga : java MonthExample {Month}");
			} else {
				
		String[] arrMonthName = {
			"jan",
			"Feb",
			"Mar",
			"Apr",
			"May",
			"June",
			"July",
			"Aug",
			"Sept",
			"Oct",
			"Nov",
			"Dec"			
		};
			
		int command = Integer.parseInt(args[0])-1;
		System.out.println(arrMonthName[command]);
	}
	}
}
