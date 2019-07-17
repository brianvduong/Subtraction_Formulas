import java.util.Random;

public class subtract1 {
	
	public static void main (String [] args) {
		
		Random rand = new Random();
		int low = 1;
		int high = 10;
		int result = rand.nextInt(high - low) + low;
		int num1 = 1;
		
		System.out.println("  " + result);
		System.out.println("- " + num1);
		System.out.println("----");
		
	}
}
