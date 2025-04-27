package Day5;

import java.util.Scanner;

public class p9 {
//22.Check if a Number is a Palindrome
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int original = number, reversed = 0;
	        while (number != 0) {
	            reversed = reversed * 10 + number % 10;
	            number /= 10;
	        }
	        if (original == reversed) {
	            System.out.println(original + " is a palindrome.");
	        } else {
	            System.out.println(original + " is not a palindrome.");
	        }
	        scanner.close();
	    }
	}