package tasks;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number:");
		int x1 = sc.nextInt();
		System.out.println("Input second number:");
		int x2 = sc.nextInt();
		sc.close();
		System.out.println(x1 % x2);
		
	}

}
