import java.util.Random;

public class Large_Borrow {
	
	public static int generateFirstDigit() {
		Random rand = new Random();
		int low = 1;
		int high = 9;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static int generateRandom() {
		Random rand = new Random();
		int low = 0;
		int high = 9;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static boolean check(int num1, int num2) {
		return ((num2 > num1) == true);
	}
	
	public static void main (String [] args) {
		int firstDigit = generateFirstDigit();
		int number1 = generateRandom();
		int number2 = generateRandom();
		
		while(check(number1,number2) != true) {
			number1 = generateRandom();
			number2 = generateRandom();
		}
		
		System.out.println("  " + firstDigit + "00" + number1);
		System.out.println("-    " + number2);
		System.out.println("-------");
	}
	
	
}
