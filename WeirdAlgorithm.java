import java.util.Scanner;

/**
 * @author AKASH
 *
 */
public class WeirdAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long n  = scan.nextInt();
		while(n != 1 ) {
			System.out.print(n + " ");
			if(n%2 == 0) {
				n = n/2;
			}else {
				n = n*3+1;
			}
		}
		System.out.print(n );
	}

}
