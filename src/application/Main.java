package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Calculating the circle area ***");
		double pi = 3.14159;
		System.out.print("Enter the circle radius: ");
		double radius = scanner.nextDouble();
		double area = pi * Math.pow(radius, 2);
		System.out.printf("Area = %.4f", area);
		
		scanner.close();
		
	}

}
