package tasks;

import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("Input string:");
		String x1 = scanner.nextLine();
		scanner.close();
		
		boolean result = x1.equals("Hello");
		System.out.println(result);
	}

}
