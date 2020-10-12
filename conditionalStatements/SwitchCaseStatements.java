package conditionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		int dayOFWeek = 4;
		
		switch(dayOFWeek) {
		case 1:
			System.out.println("I'm On leave");
			break;
		case 2:
			System.out.println("I'm in office");
			break;
		case 3:
			System.out.println("I'm playing football");
			break;
			
			default:
				System.out.println("I don't no what day it is");
		}
		
	}

}
