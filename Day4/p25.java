package Day4;

import java.util.Scanner;

public class p25 {
//2. Factorial of a Number
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int factorial = 1;
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }
	        System.out.println("Factorial of " + number + " is " + factorial);
	        scanner.close();
	    }
	}