package tasks;

import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("Input string:");
		String x1 = scanner.nextLine();
		System.out.println("Input N");
		int n = scanner.nextInt();
		scanner.close();
		
		System.out.println(x1.charAt(n));
	}

}
