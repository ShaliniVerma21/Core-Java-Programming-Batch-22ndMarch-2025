package Day2;
import java.util.Scanner;
public class P24 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of terms: ");
	        int terms = scanner.nextInt();
	        int a = 0, b = 1;
	        
	        System.out.print("Fibonacci Series: " + a + ", " + b);
	        for (int i = 2; i < terms; i++) {
	            int next = a + b;
	            System.out.print(", " + next);
	            a = b;
	            b = next;
	        }
	        System.out.println();
	        scanner.close();
	    }
	}