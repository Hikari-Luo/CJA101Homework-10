package hw3;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number");
		double a = input.nextDouble();
		System.out.println("Input a number");
		double b = input.nextDouble();
		System.out.println("Input a number");
		double c = input.nextDouble();
		
		if (a + b <= c || a + c <= b || c + b <= a) {
			System.out.println("並不是三角形");
		}
		else if (a == b && b == c && c == a) {
			System.out.println("正三角形");
		}
		else if (a == b || b == c || c == a) {
			System.out.println("等腰三角形");
		}
		else {
			System.out.println("其他三角形");
		}
		
	}
}
