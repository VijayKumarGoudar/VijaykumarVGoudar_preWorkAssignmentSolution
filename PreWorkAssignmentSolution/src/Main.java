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
				if (i >= j) {
					System.out.print("*");
				} else
					break;
			}
			System.out.println();

		}
	}
	// function to check no is prime or not

	public void checkPrimeNumber() {

		System.out.println("Enter a number to check  prime or not : ");
		int number = sc.nextInt();
		boolean isPrime = true;

		if (number == 1) {
			isPrime = false;
		}

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime)
			System.out.println("The given number " + number + " is a prime number ");
		else
			System.out.println("The given number " + number + " is a not prime number ");

	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.
		int first = 0, second = 1;

		System.out.println("Enter a number to print Fibonacci Series : ");
		int fibonacciSeriesLength = sc.nextInt();

		for (int i = 1; i <= fibonacciSeriesLength; i++) {
			if (i == 1) {
				System.out.print(first + " ");
			} else if (i == 2) {
				System.out.print(second + " ");
			} else {
				System.out.print(first + second + " ");
				int temp = first;
				first = second;
				second = second + temp;
			}

		}

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
