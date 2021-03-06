import java.util.Scanner;

public class Repetitions {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] arr = str.toCharArray();
		
		char currentChar, prevChar = 0;
		int maxCount = 0, currentCount = 0;
		for(int i = 0 ; i < arr.length; i++) {
			
			currentChar = arr[i];
			
			if(currentChar == prevChar) {
				currentCount++;
			}else {
				currentCount = 1;
			}
			if(maxCount < currentCount) {
				maxCount = currentCount;
			}
			prevChar = currentChar;
		}
		System.out.println(maxCount);
		
	}

}
