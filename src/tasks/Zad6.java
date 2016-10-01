package tasks;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("Input first string:");
		String x1 = scanner.nextLine();
		System.out.println("Input second string:");
		String x2 = scanner.nextLine();
		scanner.close();
		boolean result = x1.contains(x2);
		System.out.println(result);
	}

}
