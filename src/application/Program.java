package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measure of triangle x: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		double areaX = x.getArea();
		
		System.out.println("Enter the measure of triangle y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaY = y.getArea();
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger Triangle: X");
		} else if (areaY > areaX) {
			System.out.println("Larger Triangle: Y");
		} else {
			System.out.println("Both triangles are equals");
		}
		
		sc.close();
	}

}
