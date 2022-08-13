import java.awt.SystemColor;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {

		System.out.println("Enter a number to check Palindrome : ");
		int number = sc.nextInt();
		int temp = number;
		int reverseNumber = 0;

		while (temp > 0) {

			reverseNumber = reverseNumber * 10 + temp % 10;
			temp = temp / 10;

		}

		if (number == reverseNumber) {
			System.out.println("The given Number " + number + " is a Palindrome ");
		} else {
			System.out.println("The given Number " + number + " is not a Palindrome ");
		}

	}

	// function to printPattern

	public void printPattern() {

		System.out.println("Enter a input number to print Star Pattern  : ");
		int numberOfStarsToStartWith = sc.nextInt();

		for (int i = numberOfStarsToStartWith; i >= 1; i--) {
			for (int j = 1; j <= numberOfStarsToStartWith; j++) {
				if(i>=j) {
					System.out.print("*");
				}else
					break;
		}
			System.out.println();

	}
	}
	// function to check no is prime or not

	public void checkPrimeNumber() {

	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.
		int first = 0, second = 1;
	}

	// main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("\nEnter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
