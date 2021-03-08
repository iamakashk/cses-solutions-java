import java.util.Arrays;
import java.util.Scanner;

public class IncreasingArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long N = scan.nextInt();
		long[] arr = new long[(int) N];
		for (long i = 0; i < arr.length; i++) {
			arr[(int) i] = scan.nextInt();
		}
		long num = 999999999L;
		long steps = 0 ;
		for (long i = 0; i < arr.length ; i++) {
			if(i == arr.length-1) {
				
			}else
			 if (arr[(int) i] > arr[(int) (i + 1)]) {
				long diff = Math.abs((arr[(int) i]- arr[(int) (i+1)]));
				steps += diff;
				arr[(int) (i+1)] = arr[(int) i];
			}
		}
		System.out.println(steps);
	}

}
