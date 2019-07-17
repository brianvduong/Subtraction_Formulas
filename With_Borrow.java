import java.util.Random;

public class With_Borrow {
	public static int generateRandom() {
		Random rand = new Random();
		int low = 0;
		int high = 99;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static void main (String [] args) {
		
		int number1 = generateRandom();
		int number2 = generateRandom();
		
		while(number2 > number1) {
			number2 = generateRandom();
		}
		if(number1 < 10) {
			System.out.println("  " + number1);
			System.out.println("- " + number2);
			System.out.println("----");
		}
		else if(number2 < 10) {
			System.out.println("  " + number1);
			System.out.println("-  " + number2);
			System.out.println("-----");
		}
		else {
			System.out.println("  " + number1);
			System.out.println("- " + number2);
			System.out.println("-----");
		}		
	}
}
