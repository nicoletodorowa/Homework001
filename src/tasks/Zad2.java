package tasks;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input side of triangle:");
		double a = sc.nextInt();
		System.out.println("Input height of triangle:");
		double h = sc.nextInt();
		sc.close();
		double area = (a*h/2);
		System.out.println("Area of the triangle is: ");
		System.out.println(area);
	}

}