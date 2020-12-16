import java.util.Arrays;
import java.util.Scanner;

/**
 * @author AKASH
 *
 */
public class MissingNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N - 1];
		int actualArray[] = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			actualArray[arr[i] - 1] = arr[i];
		}

		for (int i = 0; i < actualArray.length; i++) {
			if (actualArray[i] == 0) {
				System.out.println(i + 1);
			}
		}

	}
}
