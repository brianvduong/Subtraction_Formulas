import java.util.Random;

public class Without_Borrow {
	
	public static int generateRandom() {
		Random rand = new Random();
		int low = 0;
		int high = 9;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static boolean check(int num1, int num2) {
		return ((num1 - num2) >= 0);
	}
	
	public static void main (String [] args) {
		
		int number1 = generateRandom();
		int number2 = generateRandom();
		int number3 = generateRandom();
		int number4 = generateRandom();
		
		while(check(number1, number2) != true) {
			number1 = generateRandom();
			number2 = generateRandom();
		}
		while(check(number3, number4) != true) {
			number3 = generateRandom();
			number4 = generateRandom();
		}
		
		System.out.println("  " + number1 + "" + number3);
		System.out.println("- " + number2 + "" + number4);
		System.out.println("-----");
	}

}
