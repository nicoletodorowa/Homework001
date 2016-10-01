package tasks;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("Input first string:");
		String x1 = scanner.nextLine();
		System.out.println("Input second string:");
		String x2 = scanner.nextLine();
		scanner.close();
		x1 = x1.concat("_").concat(x2);
		
		System.out.println(x1);
	}

}
