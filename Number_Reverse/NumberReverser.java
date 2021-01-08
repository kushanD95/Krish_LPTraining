import java.util.*;

public class NumberReverser {

	private int originalValue = 0;

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		NumberReverser numberReverser = new NumberReverser(); 

		System.out.println("Enter the Original Integer Value : ");
		
		numberReverser.originalValue = scanner.nextInt();
			
		System.out.println(numberReverser.numberReverse()+"  <== Reversed Integer Value");
		
			
	}


	private int numberReverse() {
		int revNum = 0, rem, dividand
;
		
		if(originalValue / 10 != 0) {
			dividand = originalValue;
			
			while(dividand != 0) {
				rem = dividand % 10;
				revNum = (revNum * 10) + rem;
				dividand /= 10;
			}

			return revNum;
		} else {
			return originalValue;
		}
	}
	
	
	
	
	
}