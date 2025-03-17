package hw3;

import java.util.Scanner;

public class Guess_number {
	public static void main(String[] args) {

		int randomNumber = (int) (Math.random() * 10 );
        Scanner scanner = new Scanner(System.in);
        int guess;
        System.out.println("Let's guess number");
	
	while (true) {
		System.out.println("guess what");
		guess = scanner.nextInt();
		if (guess == randomNumber) {
			System.out.println("Correct");
			break;
		}
		else {
			System.out.println("one more chance");
		}
		
	}
	scanner.close();
	
	}
	
}
