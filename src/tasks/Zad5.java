package tasks;

import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input real number:");
		double a = sc.nextDouble();
		System.out.println("Input integer:");
		int b = sc.nextInt();
		sc.close();
		System.out.println(a/b);
		
	}

}
